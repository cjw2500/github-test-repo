package com.example.demo.diceGame.sanghoonlee.utility;

public class SanghoonLeeCustomRandom {

    public static Integer generateRandom (int min, int max) {
        return (int) (Math.random() * max + min - 1);
    }
}
