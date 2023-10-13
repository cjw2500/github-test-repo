package com.example.demo.diceGame.minjun.entity;

import com.example.demo.diceGame.minjun.utility.MinjunKimCustomRandom;
import lombok.ToString;

@ToString
public class Dice {

    private Integer diceNumber;

    public Dice(){
        final  int MIN = 1;
        final  int MAX = 6;

        this.diceNumber = MinjunKimCustomRandom.generateRandom(MIN, MAX);
    }
}
