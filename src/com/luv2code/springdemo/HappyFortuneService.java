package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Today is your lucky day";
    }

}
