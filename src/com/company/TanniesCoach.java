package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class TanniesCoach implements Coach{

    @Autowired
    @Qualifier("Random")

private dailyFortune dailyFortuneObject;

    public TanniesCoach() {
        System.out.println("inside defult contructor tannis ");
    }

    // @Autowired
//    public TanniesCoach(dailyFortune dailyFortune) {
//        this.dailyFortuneObject = dailyFortune;
//    }
//@Autowired
//    public void setDailyFortuneObject(dailyFortune dailyFortuneObject) {
//    System.out.println("inside setDailyFortuneObject");
//        this.dailyFortuneObject = dailyFortuneObject;
//    }

    @Override
    public String getDailyWorkout() {
        return "Pratice your backHand Volley";
    }

    @Override
    public String getDailyFortune() {
        return dailyFortuneObject.getDailyFortune();

    }

    public void init(){
        System.out.println("inside create method");
    }

    public void destroy(){
        System.out.println("inside destroy method");
    }


}
