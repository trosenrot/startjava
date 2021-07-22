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
    public void setEnteredNumbers(int i, int enteredNumber) {
        this.enteredNumbers[i]=enteredNumber;
    }
    public int getEnteredNumbers(int i) {
        return enteredNumbers[i];
    }
    public void outputNumbers (int i) {
        int[] numbers = Arrays.copyOf(enteredNumbers, i+1);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        Arrays.fill(enteredNumbers, 0, i+1, 0);
    }
}