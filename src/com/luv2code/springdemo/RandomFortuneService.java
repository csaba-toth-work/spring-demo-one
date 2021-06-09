package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

    String[] fortunes = {"Best day of your life!",
            "You are very lucky today!",
            "Wish you all the best!"};
    Random random = new Random();

    @Override
    public String getFortune() {

        return fortunes[random.nextInt(fortunes.length)];
    }
}
