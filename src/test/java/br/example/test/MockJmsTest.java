package br.example.test;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MockJmsTest extends CamelTestSupport {

    protected AbstractXmlApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext(
            "META-INF/context.xml");
    }

    @Override
    protected CamelContext createCamelContext() throws Exception {
        CamelContext camelContext = super.createCamelContext();
        camelContext.addComponent("jms", camelContext.getComponent("seda"));
        return camelContext;
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("jms:topic:comandoTopic").to("mock:quote");
            }
        };
    }

    @Test
    public void testCamelFromJms() throws Exception {

        final String comando = "{\"id_horus\":\"ID0001\",\"cod_servico\":\"03\",\"msg\":\"04\",\"param\":\"01\",\"hash\":\"be4a90ed133fad3c78121ac605023fff1422d75d\"}";

        MockEndpoint mockEndpoint = getMockEndpoint("mock:quote");

        template.sendBody("jms:topic:comandoTopic", comando);

        mockEndpoint.expectedBodiesReceived(comando);

        mockEndpoint.assertIsSatisfied();

    }
}
