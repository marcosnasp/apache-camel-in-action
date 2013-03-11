package br.example.camel.ch1;

import org.apache.camel.EndpointInject;
import org.apache.camel.InOnly;
import org.apache.camel.ProducerTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@InOnly
public class MessageProducer {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageProducer.class);

    private String topic = "jms:topic:flex-client-broadcast-topic";

    @EndpointInject
    protected ProducerTemplate producer;

    public MessageProducer() {
    }

    public void init() {
        LOGGER.info(MessageProducer.class.getName() + " initialized");
    }

    public void send(String message) {
        producer.sendBody("jms:topic:flex-client-broadcast-topic", message);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

}
