package com.company;

import org.springframework.beans.factory.annotation.Value;

public class swimCoach implements Coach{

    private dailyFortune dailyFortune1;

    public swimCoach(dailyFortune theForturn){
        dailyFortune1 = theForturn;

    }
    @Value("${foo.email}")
    private String email;

    @Value("${foo.name}")
    private String TeamName;

    public String getEmail() {
        return email;
    }

    public String getTeamName() {
        return TeamName;
    }

    @Override
    public String getDailyWorkout() {
        return "swiming 1000 meter perday";
    }

    @Override
    public String getDailyFortune() {
        return dailyFortune1.getDailyFortune();
    }

}
