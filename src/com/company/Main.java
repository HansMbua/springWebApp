package com.company;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
   //read spring config file
        ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");

        //get bean from spring container
        Coach thatSillyCoach = context.getBean("tanniesCoach", Coach.class);


        //call method on the bean
        System.out.println(thatSillyCoach.getDailyWorkout());
        System.out.println(thatSillyCoach.getDailyFortune());
        // close the contect file
        context.close();
    }
}
