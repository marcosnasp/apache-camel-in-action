package br.example.test;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.example.camel.ch1.FileCopierWithCamel;
import br.example.test.utils.TestLogHelper;

/**
 * Same tests with apache camel and CamelTestSupport...
 */
@RunWith(Parameterized.class)
public class FirstTest extends CamelTestSupport {

    static final Logger LOGGER = LoggerFactory.getLogger(FirstTest.class);

    private static final String NAME_TEST = FirstTest.class.getName();

    private FileCopierWithCamel fileCopierWithCamel;

    public FirstTest(FileCopierWithCamel fileCopierWithCamel) {
        this.fileCopierWithCamel = fileCopierWithCamel;
    }

    @BeforeClass
    public static void testSetUp() throws Exception {
        TestLogHelper.startTestLogging(NAME_TEST);
    }

    @AfterClass
    public static void testCleanUp() throws Exception {
        TestLogHelper.stopTestLogging();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getMensagensDeComando() {

        CamelContext context = new DefaultCamelContext();
        FileCopierWithCamel fileCopierWithCamel = new FileCopierWithCamel(context);

        return Arrays.asList(new Object[][] { { fileCopierWithCamel } });

    }

    @Test
    public void testInstanceFileCopierWithCamel() {
        assertNotNull(fileCopierWithCamel);
    }

    /**
     * Make sure that a file exists on 'data/inbox' folder named with 'hello.txt' before run this method.
     * 
     * @throws Exception
     */
    @Test
    public void testMoveFile() throws Exception {

        fileCopierWithCamel.transferFiles();

        File target = new File("data/outbox/hello.txt");

        assertTrue("File not moved", !target.exists());
    }

}