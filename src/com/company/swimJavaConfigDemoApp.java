package com.company;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class swimJavaConfigDemoApp {

    public static void main(String[] args) {
   //read spring config file
       AnnotationConfigApplicationContext context =  new  AnnotationConfigApplicationContext(sportConfig.class);

        //get bean from spring container
        swimCoach thatSillyCoach = context.getBean("swimCoach", swimCoach.class);


        //call method on the bean
//        System.out.println(thatSillyCoach.getDailyWorkout());
//        System.out.println(thatSillyCoach.getDailyFortune());


        System.out.println("email: "+thatSillyCoach.getEmail());
        System.out.println("TeamName: "+thatSillyCoach.getTeamName());

        // close the contect file
        context.close();
    }
}
