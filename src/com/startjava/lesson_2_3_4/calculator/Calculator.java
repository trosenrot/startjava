package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Math.*;

public class Calculator {
    private int x;
    private int y;
    private char mathSign;
    private String[] mathExpression;

    public int getX() {
        return x;
    }

    public boolean setX(int x) {
        if (x > 0) {
            this.x = x;
            return true;
        }
        System.out.println("Введено некорректное значение! (число должно быть > 0)");
        return false;
    }

    public int getY() {
        return y;
    }

    public boolean setY(int y) {
        if (y > 0) {
            this.y = y;
            return true;
        }
        System.out.println("Введено некорректное значение! (число должно быть > 0)");
        return false;
    }

    public char getMathSign() {
        return mathSign;
    }

    public boolean setMathSign(char mathSign) {
        switch (mathSign) {
            case '+':
            case '-':
            case '/':
            case '*':
            case '%':
            case '^':
                this.mathSign = mathSign;
                return true;
            default:
                System.out.println("Введено некорректное значение! (доступные операции: +, -, *, /, ^, %)");
                return false;
        }
    }

    public boolean checkMathExpression(String expression) {
        mathExpression = expression.split(" ");
        x = Integer.parseInt(mathExpression[0]);
        mathSign = mathExpression[1].charAt(0);
        y = Integer.parseInt(mathExpression[2]);
        if (setX(x) && setMathSign(mathSign) && setY(y)) {
            return false;
        }
        return true;
    }

    public int calculate() {
        switch (mathSign) {
            case '+':
                return addExact(x, y);
            case '-':
                return subtractExact(x, y);
            case '/':
                return floorDiv(x, y);
            case '*':
                return multiplyExact(x, y);
            case '%':
                return floorMod(x, y);
            case '^':
                return (int) pow(x, y);
        }
        return 0;
    }
}
