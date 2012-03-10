package br.example.camel.ch1.routers;

import org.apache.camel.builder.RouteBuilder;


public class FileTransferRouterBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:data/inbox?noop=true").to("file:data/outbox");
	}

}
