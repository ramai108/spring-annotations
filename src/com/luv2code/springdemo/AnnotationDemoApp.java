package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class AnnotationDemoApp {

    public static void main(String[] args) throws IOException {
        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach",Coach.class);
        //Coach ufcCoach = context.getBean("ufcTrainer",Coach.class);
        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        //System.out.println(ufcCoach.getDailyWorkout());
        //call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());
        // close the context
        context.close();
    }
}
