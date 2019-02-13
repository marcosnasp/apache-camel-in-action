package br.example.test.jdbc;

import org.apache.camel.impl.JndiRegistry;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.After;
import org.junit.Before;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

public abstract class AbstractJdbcTestSupport extends CamelTestSupport {

    protected EmbeddedDatabase db;

    @Override
    protected JndiRegistry createRegistry() throws Exception {
        // START SNIPPET: register
        JndiRegistry reg = super.createRegistry();
        reg.bind("testdb", db);
        return reg;
        // END SNIPPET: register
    }

    @Before
    @Override
    public void setUp() throws Exception {
        db = new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2).addScript("sql/init.sql").build();
        super.setUp();
    }

    @After
    @Override
    public void tearDown() throws Exception {
        super.tearDown();

        db.shutdown();
    }
}
