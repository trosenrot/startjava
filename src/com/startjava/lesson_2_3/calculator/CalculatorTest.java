package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner console = new Scanner(System.in);
        String answer;

        do {
            int x;

            do {
                System.out.println("Введите первое число: ");
                x = console.nextInt();
            } while (!calculator.setX(x));

            char mathSign;

            do {
                System.out.println("Введите знак математической операции: ");
                mathSign = console.next().charAt(0);
            } while (!calculator.setMathSign(mathSign));

            int y;

            do {
                System.out.println("Введите второе число: ");
                y = console.nextInt();
            } while (!calculator.setY(y));

            calculator.calculate();
            console.nextLine();
            
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                answer = console.next();
            } while (!answer.equals("yes") && !answer.equals("no")); 
        } while (answer.equals("yes"));
    }
}