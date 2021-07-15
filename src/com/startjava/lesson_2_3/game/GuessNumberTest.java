package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите имя первого игрока: ");
        Player playerOne = new Player(console.nextLine());
        System.out.println("Введите имя второго игрока: ");
        Player playerTwo = new Player(console.nextLine());
        String answer;

         do {
            GuessNumber game = new GuessNumber(playerOne, playerTwo);
            game.play();

            do {
                System.out.println("Хотите продолжить игру? [yes/no]: ");
                answer = console.next();
            } while(!answer.equals("yes") && !answer.equals("no")); 
        } while (answer.equals("yes"));
    }
}