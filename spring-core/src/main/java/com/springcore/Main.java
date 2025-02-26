package com.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // Declare this class as a spring Application
@ComponentScan("com.springcore") // Scan for components in this package
public class Main {

    public static void main(String[] args) {

        /* Without using spring "IoC"*/
        // Here we're getting HelloWorldMessage object by us e.g(new HelloWorldMessage())
//        HelloWorldMessage helloWorldMessage = new HelloWorldMessage();
//        System.out.println(helloWorldMessage.getMessage());


        /* With spring *
         * It may look difficult to observe the benefit of using Spring IoC in this example.
         * However, its real usage becomes clear in larger projects.
         */

        // AnnotationConfigApplicationContext is a Spring IoC container.
        // It creates and manages the objects (beans) defined in the configuration (Main.class).
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        // Retrieve a bean of type HelloWorldMessage from the Spring IoC container.
        HelloWorldMessage message = context.getBean(HelloWorldMessage.class);
        Greeter greeter = context.getBean(Greeter.class);
        greeter.greet();
        System.out.println(message.getMessage());

    }
}