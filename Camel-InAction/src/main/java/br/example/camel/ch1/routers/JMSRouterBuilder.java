package br.example.camel.ch1.routers;

import org.apache.camel.builder.RouteBuilder;

public class JMSRouterBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:data/inbox?noop=true").to("jms:topic:flex-client-broadcast-topic");
	}

}