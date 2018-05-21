package br.example.camel.ch1.routers;

import br.example.camel.ch1.pojos.RowDataCsv;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.model.dataformat.BindyType;

public class CSVRouterBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        Class<?> type = RowDataCsv.class;
        BindyCsvDataFormat dataFormat = new BindyCsvDataFormat();
        dataFormat.setClassType(type);
        dataFormat.setLocale("en");

        from("file://csv?idempotent=true")
                .streamCaching()
                .unmarshal().bindy(BindyType.Csv, type)
                .to("mock:out");
        from("direct:in")
                .marshal(dataFormat)
                .to("mock:in");
    }

}
