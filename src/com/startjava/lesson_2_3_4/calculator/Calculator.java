package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int x;
    private int y;
    private char mathSign;

    public int getX() {
        return x;
    } 

    public boolean setX(int x) {
        if (x > 0) {
            this.x = x;
            return true;
        } else {
            System.out.println("Введено некорректное значение! (число должно быть > 0)");
            return false;
        }
    }

    public int getY() {
        return y;
    }

    public boolean setY(int y) {
        if (y > 0) {
            this.y = y;
            return true;
        } else {
            System.out.println("Введено некорректное значение! (число должно быть > 0)");
            return false;
        }
    }

    public char getMathSign() {
        return mathSign;
    }

    public boolean setMathSign(char mathSign) {
        switch (mathSign) {
            case '+' :
            case '-' :
            case '/' :
            case '*' :
            case '%' :
            case '^' :
                this.mathSign = mathSign;
                return true;
            default :
                System.out.println("Введено некорректное значение! (доступные операции: +, -, *, /, ^, %)");
                return false;
        }
    }

    public int calculate() {
        switch (mathSign) {
            case '+' :
                return Math.addExact(x, y);
            case '-' :
                return Math.subtractExact(x, y);
            case '/' :
                return Math.floorDiv(x, y);
            case '*' :
                return Math.multiplyExact(x, y);
            case '%' :
                return Math.floorMod(x, y);
            case '^' :
                return (int)Math.pow(x, y);
        }
        return 0;
    }
}
