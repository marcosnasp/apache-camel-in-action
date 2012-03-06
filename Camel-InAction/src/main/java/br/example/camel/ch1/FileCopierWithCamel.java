package br.example.camel.ch1;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class FileCopierWithCamel {

    private CamelContext contextFileTransfer;

    public FileCopierWithCamel(CamelContext context) {

        // Add Route To Context, if it was not previously added...
        if (!context.getRoutes().isEmpty()) {
            try {
                context.addRoutes(createFileTransferRouteBuider());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        contextFileTransfer = context;
    }

    private static RouteBuilder createFileTransferRouteBuider() {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("file:data/inbox?noop=true").to("file:data/outbox");
            }
        };
    }

    /**
     * Transfer files from 'data/inbox' to 'data/outbox' folder.
     */
    public void transferFiles() {

        if (contextFileTransfer != null) {
            try {
                contextFileTransfer.start();
                Thread.sleep(10000);
                contextFileTransfer.stop();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String args[]) throws Exception {

        CamelContext context = new DefaultCamelContext();
        context.addRoutes(FileCopierWithCamel.createFileTransferRouteBuider());

        FileCopierWithCamel fileCopier = new FileCopierWithCamel(context);
        fileCopier.transferFiles();

    }

}