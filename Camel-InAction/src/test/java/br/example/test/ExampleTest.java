package br.example.test;

import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.example.test.utils.TestLogHelper;

public class ExampleTest {
	
	static final Logger logger = LoggerFactory.getLogger(ExampleTest.class);
	static final String TEST_NAME = ExampleTest.class.getName();
	
	@BeforeClass
	public static void testSetUp() throws Exception {
		TestLogHelper.startTestLogging(TEST_NAME);
	}
	
	@AfterClass
	public static void testCleanUp() throws Exception {
		TestLogHelper.stopTestLogging();
	}
	
	@Test
	public void testExample() { 
		
		logger.info("é verdadeiro");
		Assert.assertEquals(true, true);
		
	}

}
