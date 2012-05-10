package br.example.camel.ch1;

import org.apache.camel.CamelContext;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.example.camel.ch1.routers.JMSRouterBuilder;

public class JMSCamelExample {

	private ApplicationContext ctx;
	private CamelContext context;
	
	public JMSCamelExample() {
	    
	    ctx = new ClassPathXmlApplicationContext("META-INF/context.xml");
	    JmsComponent jmsComponent = ctx.getBean("jms", JmsComponent.class);
	    
		context = new DefaultCamelContext();
		context.addComponent("jms", jmsComponent);
	}
	
	@SuppressWarnings("unused")
	private void addRouter() {
		try {
			context.addRoutes(new JMSRouterBuilder());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void publishingToJMSQueue() {
		if(context != null) {
			try {
				context.start();
				Thread.sleep(10000);
				context.stop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		JMSCamelExample jmsCamelExample = new JMSCamelExample();
		jmsCamelExample.publishingToJMSQueue();
	}
	
}
