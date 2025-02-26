package com.springcore;

import org.springframework.stereotype.Component;

@Component // mark it as a spring component
public class HelloWorldMessage {

    public String getMessage() {
        return "Hello World";
    }
}
