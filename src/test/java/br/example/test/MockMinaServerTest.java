package br.example.test;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.apache.camel.util.jndi.JndiContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.example.camel.ch1.eip.LogQuartzBean;

public class MockMinaServerTest extends CamelTestSupport {

    protected AbstractXmlApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext(
            "META-INF/context.xml");
    }

    @Override
    protected CamelContext createCamelContext() throws Exception {
        JndiContext context = new JndiContext();
        context.bind("logQuartzBean", new LogQuartzBean());

        CamelContext camelContext = new DefaultCamelContext(context);

        return camelContext;
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("mina:tcp://localhost:5000?minaLogger=true&disconnectOnNoReply=false&sync=false;codec=#codec").
                    to("bean:logQuartzBean").
                    to("mock:quote");
            }
        };
    }

}
