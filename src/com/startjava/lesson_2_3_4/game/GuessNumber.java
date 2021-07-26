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
                outputNumbers(playerOne, i);
                outputNumbers(playerTwo, i - 1);
                break;
            }
            if (makeMove(playerTwo, i)) {
                outputNumbers(playerOne, i);
                outputNumbers(playerTwo, i);
                break;
            }
        }
    }

    private boolean makeMove(Player player, int i) {
        boolean check;
        inputNumber(player, i);
        check = checkNumber(player, i);
        if (i == 9) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
        return check;
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
        return false;
    }

    private void outputNumbers(Player player, int i) {
        System.out.println("Игрок " + player.getName() + " назвал числа:");
        int[] numbers = Arrays.copyOf(player.getEnteredNumbers(), i + 1);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        Arrays.fill(numbers, 0, i + 1, 0);
    }
}