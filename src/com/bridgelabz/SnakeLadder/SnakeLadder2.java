package com.bridgelabz.SnakeLadder;

import java.util.Random;

public class SnakeLadder2 {
    static void getDieRoll() {
        Random random = new Random();
        int roll = random.nextInt(6) + 1;
        System.out.println(roll);
    }

    public static void main(String[] args) {
        getDieRoll();
    }
}
