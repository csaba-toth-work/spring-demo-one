package com.luv2code.springdemo;

public class BodyBuilderCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "lift up 100 kg on the bench";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
