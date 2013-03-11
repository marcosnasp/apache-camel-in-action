package br.example.camel.ch1.eip;

import java.util.logging.Logger;

public class LogQuartzBean {

    Logger logger = Logger.getLogger(LogQuartzBean.class.getName());

    public void method(String text) {
        logger.info("Texto: " + text);
    }

}
