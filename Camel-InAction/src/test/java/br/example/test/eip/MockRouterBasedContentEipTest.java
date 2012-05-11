package br.example.test.eip;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Mina Endpoint: mina:tcp://localhost:5000?disconnectOnNoReply=false&sync=false;codec=#codec ...
 * 
 */
public class MockRouterBasedContentEipTest extends CamelTestSupport {

    protected AbstractXmlApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext("META-INF/context.xml");
    }

    private Map<String, MockEndpoint> getListMockEndpoints() {
        Map<String, MockEndpoint> endpoints = new HashMap<String, MockEndpoint>();

        endpoints.put("camera", getMockEndpoint("mock:camera"));
        endpoints.put("gps", getMockEndpoint("mock:gps"));
        endpoints.put("keyboard", getMockEndpoint("mock:keyboard"));
        endpoints.put("modem3g", getMockEndpoint("mock:modem3g"));
        endpoints.put("quote", getMockEndpoint("mock:quote"));

        return endpoints;
    }

    private void verifyEndpointForKey(String keyMap) throws InterruptedException {
        Collection<MockEndpoint> mockEndpoints = getListMockEndpoints().values();

        for (MockEndpoint mockEndpoint : mockEndpoints) {
            if (getListMockEndpoints().get(keyMap).equals(mockEndpoint)) {
                mockEndpoint.expectedMessageCount(1);
                mockEndpoint.assertIsSatisfied();
            } else {
                mockEndpoint.expectedMessageCount(0);
                mockEndpoint.assertIsSatisfied();
            }
        }
    }

    @Override
    protected CamelContext createCamelContext() throws Exception {
        CamelContext camelContext = super.createCamelContext();
        return camelContext;
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("seda:comandoTopic").choice().when(body().contains("\"cod_servico\":\"03\"")).to("mock:camera")
                        .when(body().contains("\"cod_servico\":\"01\"")).to("mock:gps")
                        .when(body().contains("\"cod_servico\":\"04\"")).to("mock:keyboard")
                        .when(body().contains("\"cod_servico\":\"06\"")).to("mock:modem3g").otherwise().to("mock:quote");
            }
        };
    }

    @Test
    public void testCamelFromJms() throws Exception {

        final String comando = "{\"id_horus\":\"ID0001\",\"cod_servico\":\"03\",\"msg\":\"04\",\"param\":\"01\",\"hash\":\"be4a90ed133fad3c78121ac605023fff1422d75d\"}";

        template.sendBody("seda:comandoTopic", comando);
        
        verifyEndpointForKey("camera");

    }

    @Test
    public void testCamelCamera() throws Exception {

        final String comando = "{\"id_horus\":\"ID0001\",\"cod_servico\":\"01\",\"msg\":\"04\",\"param\":\"01\",\"hash\":\"be4a90ed133fad3c78121ac605023fff1422d75d\"}";

        template.sendBody("seda:comandoTopic", comando);

        verifyEndpointForKey("gps");

    }

}
