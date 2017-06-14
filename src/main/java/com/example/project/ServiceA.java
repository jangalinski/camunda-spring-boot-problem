package com.example.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceA {

    private final ServiceB serviceB;

    @Autowired
    public ServiceA(final ServiceB serviceB) {
        this.serviceB = serviceB;
    }

    public void doThat() {
        serviceB.doThis();
    }
}
