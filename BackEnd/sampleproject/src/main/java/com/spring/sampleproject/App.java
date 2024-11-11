package com.spring.sampleproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        
        Dev d = context.getBean(Dev.class);
        d.Display();
        
    }
}
