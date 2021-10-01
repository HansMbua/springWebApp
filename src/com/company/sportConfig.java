package com.company;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class sportConfig {

    //define bean for sab fortune
 @Bean
    public sadForturnService sadForturnService1(){
        return new sadForturnService();

    }

    //define bean for swim coach and inject dependencies
    @Bean
    public Coach swimCoach(){
        return new swimCoach(sadForturnService1());
    }

}
/**
 * Injecting values from properties files
 * load properties in spring config(@propertySources("classpath:sport.poperties"))
 * Reference values from properties files
 * { ---- @value("${foo.email}")  -----}
 */