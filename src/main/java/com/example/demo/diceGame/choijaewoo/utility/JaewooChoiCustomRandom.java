package com.example.demo.diceGame.choijaewoo.utility;

public class JaewooChoiCustomRandom {

    public static Integer generateRandom(int min, int max) {
    return (int) (Math.random() * max + min - 1);
    }
}
