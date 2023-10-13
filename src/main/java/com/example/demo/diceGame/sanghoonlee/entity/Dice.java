package com.example.demo.diceGame.sanghoonlee.entity;


import com.example.demo.diceGame.sanghoonlee.utility.SanghoonLeeCustomRandom;
import lombok.ToString;

@ToString
public class Dice {

    private Integer diceNumber;

    public Dice () {
        final int MIN = 1;
        final int MAX = 6;

        this.diceNumber = SanghoonLeeCustomRandom.generateRandom(MIN, MAX);
    }
}
