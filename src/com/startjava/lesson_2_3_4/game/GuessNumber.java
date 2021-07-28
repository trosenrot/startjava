package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int secretNumber;
    private final Player playerOne;
    private final Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void play() {
        Random random = new Random();
        secretNumber = random.nextInt(101);

        for (int i = 0; i < 10; i++) {
            if (makeMove(playerOne)) {
                break;
            }
            if (makeMove(playerTwo)) {
                break;
            }
        }

        outputNumbers(playerOne);
        playerOne.fillEnteredNumbers();
        outputNumbers(playerTwo);
        playerTwo.fillEnteredNumbers();
    }

    private boolean makeMove(Player player) {
        inputNumber(player);
        boolean check = checkNumber(player);
        if (player.getNumberAttempts() == 9 && !check) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
        return check;
    }

    private void inputNumber(Player player) {
        Scanner console = new Scanner(System.in);
        System.out.print(player.getName() + " введите число: ");
        player.setEnteredNumber(console.nextInt());
    }

    private boolean checkNumber(Player player) {
        if (player.getEnteredNumber() > secretNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else if (player.getEnteredNumber() < secretNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else {
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNumber + " с " + (player.getNumberAttempts() + 1) + " попытки");
            return true;
        }
        return false;
    }

    private void outputNumbers(Player player) {
        System.out.println("Игрок " + player.getName() + " назвал числа:");
        int[] numbers = player.getEnteredNumbers();
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}