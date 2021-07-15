package com.startjava.lesson_1.game;

public class MyFirstGame {
    public static void main(String[] args) {
        int secretNumber = 17;
        int playerNumber = 50;
        int step = 10;
        while (playerNumber != secretNumber) {
            System.out.println(playerNumber);
            if (playerNumber > secretNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
                playerNumber -= step;
            } else {
                System.out.println("Данное число меньше того, что загадал компьютер");
                playerNumber += step;
            }
            if (step <= 1) {
                step = 1;
            } else {
                step--;
            }
        }
        System.out.println(playerNumber);
        System.out.println("Поздравляю, число угадано!");
    }
}