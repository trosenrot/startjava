package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private final String name;
    private final int[] enteredNumbers = new int[10];
    private int numberAttempts = -1;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEnteredNumber(int enteredNumber) {
        numberAttempts++;
        enteredNumbers[numberAttempts] = enteredNumber;
    }

    public int getNumberAttempts() {
        return numberAttempts;
    }

    public int getEnteredNumber() {
        if (numberAttempts == -1) {
            return 0;
        }
        return enteredNumbers[numberAttempts];
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, numberAttempts + 1);
    }

    public void fillEnteredNumbers() {
        Arrays.fill(enteredNumbers, 0, numberAttempts + 1, 0);
        numberAttempts = -1;
    }
}