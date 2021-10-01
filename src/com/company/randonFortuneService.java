package com.company;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
@Qualifier("Random")
public class randonFortuneService implements dailyFortune {

    Random random = new Random();

    @Override
    public String getDailyFortune() {
        return Random();
    }

    public String  Random(){
        //create array
        String[] forturn = {"today is a wonderful day for you","love your work"," meet a random stranger"};
        List<String > list = Arrays.asList(forturn[random.nextInt(2)]);

        System.out.println("inside Random");
        //return random String
        list.forEach(System.out::println);
        String next = list.stream().iterator().next();
        return next;

    }
}
