package br.example.test;

import java.io.File;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

/**
 * Same tests with apache camel and CamelTestSupport...
 */
public class FirstTest extends CamelTestSupport {
	@Override
	protected RouteBuilder createRouteBuilder() throws Exception {
		return new RouteBuilder() {
			@Override
			public void configure() throws Exception {
				from("file://data/inbox?noop=true").to("file://data/outbox");
			}
		};
	}

	@Test
	public void testMoveFile() throws Exception {
		
		template.sendBodyAndHeader("file://data/inbox", "Hello World",
				Exchange.FILE_NAME, "hello.txt");
		
		Thread.sleep(1000);
		File target = new File("data/outbox/hello.txt");
		
		assertTrue("File not moved", target.exists());
	}
	
	@Test
	public void testContentFileTransfer() throws Exception {
		
		template.sendBodyAndHeader("file://data/inbox", "Hello World",
				Exchange.FILE_NAME, "hello.txt");
		
		File target = new File("data/outbox/hello.txt");
		String content = context.getTypeConverter().convertTo(String.class, target);
		
		assertEquals("Hello World", content);
		
	}
	
}