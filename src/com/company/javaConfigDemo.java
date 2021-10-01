package com.company;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class javaConfigDemo {

    public static void main(String[] args) {
   //read spring config file
       AnnotationConfigApplicationContext context =  new  AnnotationConfigApplicationContext(sportConfig.class);

        //get bean from spring container
        Coach thatSillyCoach = context.getBean("tanniesCoach", Coach.class);


        //call method on the bean
        System.out.println(thatSillyCoach.getDailyWorkout());
        System.out.println(thatSillyCoach.getDailyFortune());
        // close the contect file
        context.close();
    }
}
