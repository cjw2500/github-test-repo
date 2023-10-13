package com.example.demo.diceGame.minjun.utility;

public class MinjunKimCustomRandom {
    public static  Integer generateRandom(int min, int max){
        return (int) (Math.random() * max + min - 1 );
    }
}
