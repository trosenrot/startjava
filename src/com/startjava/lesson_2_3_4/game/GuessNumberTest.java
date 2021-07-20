package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player playerOne = new Player(console.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player playerTwo = new Player(console.nextLine());
        String answer;

        do {
            System.out.println("У каждого игрока есть 10 попыток отгадать число");
            GuessNumber game = new GuessNumber(playerOne, playerTwo);
            game.play();

            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = console.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}