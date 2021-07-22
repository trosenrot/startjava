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
        Random random = new Random();
        secretNumber = random.nextInt(101);

        for (int i = 0; i < 10; i++) {
            if (makeMove(playerOne, i)) {
                outputNumbers(i, i-1);
                break;
            }
            if (makeMove(playerTwo, i)) {
                outputNumbers(i, i);
                break;
            }
        }
    }

    private boolean makeMove(Player player, int i) {
        inputNumber(player,i);
        return checkNumber(player, i);
    }

    private void inputNumber(Player player, int i) {
        Scanner console = new Scanner(System.in);
        System.out.print(player.getName() + " введите число: ");
        player.setEnteredNumber(i, console.nextInt());
    }

    private boolean checkNumber(Player player, int i) {
        if (player.getEnteredNumber(i) > secretNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else if (player.getEnteredNumber(i) < secretNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else {
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNumber + " с " + (i + 1) + " попытки");
            return true;
        }
        if (i == 9) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
        return false;
    }

    private void outputNumbers(int i, int j) {
        System.out.println("Игрок " + playerOne.getName() + " назвал числа:");
        outputArray(Arrays.copyOf(playerOne.outputNumbers(), i+1), i);
        System.out.println("Игрок " + playerTwo.getName() + " назвал числа:");
        outputArray(Arrays.copyOf(playerTwo.outputNumbers(), j+1), j);
    }

    private void outputArray(int[] numbers, int i) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        Arrays.fill(numbers, 0, i+1, 0);
    }
}