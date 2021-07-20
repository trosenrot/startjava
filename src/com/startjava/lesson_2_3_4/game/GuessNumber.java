package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int secretNumber;
    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }
    
    public void play() {
        Scanner stringConsole = new Scanner(System.in);
        Random random = new Random();
        secretNumber = random.nextInt(101);
        int i;

        for (i = 0; i < 10; i++) {
            System.out.print(playerOne.getName() + " введите число: ");
            playerOne.namedNumbers[i] = stringConsole.nextInt();
            if (checkNumber(playerOne.getName(), playerOne.namedNumbers[i], i)) {
                out(i, i-1);
                break;
            }

            System.out.print(playerTwo.getName() + " введите число: ");
            playerTwo.namedNumbers[i] = stringConsole.nextInt();
            if (checkNumber(playerTwo.getName(),  playerTwo.namedNumbers[i], i)) {
                out(i, i);
                break;
            }
        }
    }

    private boolean checkNumber (String name, int number, int i) {
        if (number > secretNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else if (number < secretNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else {
            System.out.println("Игрок " + name + " угадал число " + secretNumber + " с " + (i + 1) + " попытки");
            return true;
        }
        if (i == 9) {
            System.out.println("У " + name + " закончились попытки");
        }
        return false;
    }

    private void out (int i, int j) {
        System.out.println("Игрок " + playerOne.getName() + " назвал числа:");
        outputArray(Arrays.copyOf(playerOne.namedNumbers, i+1));
        Arrays.fill(playerOne.namedNumbers, 0, i+1, 0);
        System.out.println("Игрок " + playerTwo.getName() + " назвал числа:");
        outputArray(Arrays.copyOf(playerTwo.namedNumbers, j+1));
        Arrays.fill(playerOne.namedNumbers, 0, j+1, 0);
    }

    private void outputArray (int[] outArray) {
        for (int array : outArray) {
            System.out.print(array + " ");
        }
        System.out.println();
    }
}