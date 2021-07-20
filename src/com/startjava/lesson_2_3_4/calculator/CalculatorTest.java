package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner console = new Scanner(System.in);
        String answer;

        do {
            int x;
            char mathSign;
            int y;

            do {
                System.out.print("Введите математическое выражение: ");
                String[] mathExpression = console.nextLine().split(" ");
                x = Integer.parseInt(mathExpression[0]);
                mathSign = mathExpression[1].charAt(0);
                y = Integer.parseInt(mathExpression[2]);
            } while (!calculator.setX(x) || !calculator.setMathSign(mathSign) || !calculator.setY(y));

            System.out.println(x + " " + mathSign + " " + y + " = " + calculator.calculate());

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                answer = console.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
            console.nextLine();
        } while (answer.equals("yes"));
    }
}