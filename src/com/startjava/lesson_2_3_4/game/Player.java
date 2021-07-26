package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private final String name;
    private final int[] enteredNumbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEnteredNumber(int i, int enteredNumber) {
        enteredNumbers[i] = enteredNumber;
    }

    public int getEnteredNumber(int i) {
        return enteredNumbers[i];
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, 10);
    }
}