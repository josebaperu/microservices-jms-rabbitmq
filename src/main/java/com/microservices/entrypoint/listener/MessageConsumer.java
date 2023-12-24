package com.microservices.entrypoint.listener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
    private final Log logger = LogFactory.getLog(getClass());

    @JmsListener(destination = "rabbit_queue")
    public void onMessage(String message) {
        logger.info("");
        logger.info( this.getClass().getSimpleName());
        logger.info("Received message is: " + message);
    }
}
