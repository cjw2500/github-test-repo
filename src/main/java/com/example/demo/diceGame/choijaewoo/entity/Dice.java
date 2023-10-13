package com.example.demo.diceGame.choijaewoo.entity;

import com.example.demo.diceGame.choijaewoo.utility.JaewooChoiCustomRandom;
import lombok.ToString;

@ToString
public class Dice {

    private Integer diceNumber;

    public Dice(){
        final int MIN =1;
        final int MAX =6;

        this.diceNumber = JaewooChoiCustomRandom.generateRandom(MIN,MAX);
    }
}
