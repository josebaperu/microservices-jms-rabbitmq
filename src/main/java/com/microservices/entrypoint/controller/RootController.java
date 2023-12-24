package com.microservices.entrypoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @Autowired
    private JmsTemplate jmsTemplate;


    @GetMapping("/root")
    @ResponseBody
    public ResponseEntity<?> getRootResponse() {
        jmsTemplate.convertAndSend("rabbit_queue", "hello world");
        return new ResponseEntity<String>("cool", HttpStatus.OK);
    }
}
