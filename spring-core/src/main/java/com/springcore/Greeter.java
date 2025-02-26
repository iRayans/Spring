package com.springcore;

import org.springframework.stereotype.Component;

@Component
public class Greeter {
    public void greet() {
        System.out.println("Hello Spring! ");
    }
}
