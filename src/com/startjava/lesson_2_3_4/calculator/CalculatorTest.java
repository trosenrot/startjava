package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner console = new Scanner(System.in);
        String answer;
        do {
            do {
                System.out.print("Введите математическое выражение: ");
            } while (calculator.mathExpression(console.nextLine()));

            System.out.println(calculator.getX() + " " + calculator.getMathSign() + " " + calculator.getY() + " = " + calculator.calculate());

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                answer = console.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
            console.nextLine();
        } while (answer.equals("yes"));
    }
}