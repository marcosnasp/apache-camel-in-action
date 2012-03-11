package br.example.camel.ch1;

import javax.jms.ConnectionFactory;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;

import br.example.camel.ch1.routers.JMSRouterBuilder;

public class JMSCamelExample {

	private static final String URL_BROKER = "tcp://localhost:8161/";
	
	private ConnectionFactory factory;
	private CamelContext context;
	
	public JMSCamelExample() {
		factory = new ActiveMQConnectionFactory(URL_BROKER);
		context = new DefaultCamelContext();
		context.addComponent("jms", JmsComponent.jmsComponentAutoAcknowledge(factory));
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
