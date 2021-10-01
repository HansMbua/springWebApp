package com.company;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("luckyDay")
public class dailyFortuneService implements dailyFortune {
    @Override
    public String getDailyFortune() {
        return "today is your lucky day";
    }
}
