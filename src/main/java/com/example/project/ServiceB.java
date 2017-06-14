package com.example.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ServiceB {

    private final RestTemplate restTemplate;

    @Autowired
    public ServiceB(final RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void doThis() {
        restTemplate.postForLocation("test", null);
    }
}
