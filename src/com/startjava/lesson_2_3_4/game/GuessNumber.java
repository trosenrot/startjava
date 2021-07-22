package com.startjava.lesson_2_3_4.game;

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
            if (inputNumber(playerOne, i)) {
                out(i, i-1);
                break;
            }
            if (inputNumber(playerTwo, i)) {
                out(i, i);
                break;
            }
        }
    }

    private boolean inputNumber(Player player, int i) {
        Scanner console = new Scanner(System.in);
        System.out.print(player.getName() + " введите число: ");
        player.setEnteredNumbers(i, console.nextInt());
        return checkNumber(player, i);
    }

    private boolean checkNumber(Player player, int i) {
        if (player.getEnteredNumbers(i) > secretNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else if (player.getEnteredNumbers(i) < secretNumber) {
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

    private void out (int i, int j) {
        System.out.println("Игрок " + playerOne.getName() + " назвал числа:");
        playerOne.outputNumbers(i);
        System.out.println("Игрок " + playerTwo.getName() + " назвал числа:");
        playerTwo.outputNumbers(j);
    }
}