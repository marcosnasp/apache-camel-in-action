package br.example.camel.ch1;

public class CamelTestApp {

    private MessageProducer producer;

    public CamelTestApp() {
        producer = new MessageProducer();
    }

    public MessageProducer getProducer() {
        return producer;
    }

    public void setProducer(MessageProducer producer) {
        this.producer = producer;
    }

    public static void main(String[] args) {

        CamelTestApp camelTestApp = new CamelTestApp();
        camelTestApp.getProducer().send("Hello");
    }

}
