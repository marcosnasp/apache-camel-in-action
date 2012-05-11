package br.example.test;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.apache.camel.util.jndi.JndiContext;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.example.camel.ch1.eip.LogQuartzBean;

public class MockQuartzTest extends CamelTestSupport {

    protected AbstractXmlApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext(
                       "META-INF/context.xml");       
    }
    
    @Override
    protected CamelContext createCamelContext() throws Exception {
        JndiContext context = new JndiContext();
        context.bind("logQuartzBean", new LogQuartzBean());
        
        CamelContext camelContext = new DefaultCamelContext(context);
        camelContext.addComponent("jms", camelContext.getComponent("seda"));
        
        return camelContext;
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("quartz://timerName?trigger.repeatInterval=15s&trigger.repeatCount=4").setBody().simple("ID").
                 to("bean:logQuartzBean").
                 to("mock:quote");
            }
        };
    }

    //timer://foo?fixedRate=true&repeatCount=-1&delay=1s&period=5s
    //quartz://timerName?trigger.repeatInterval=10000&trigger.repeatCount=50
    @Test
    public void testCamelFromJms() throws Exception {
        
        startCamelContext(); 
        Thread.sleep(60000);
        stopCamelContext();
        
        
    }
}
