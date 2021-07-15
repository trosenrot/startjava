package com.startjava.lesson_1.statement;

public class ConditionalStatement {
    public static void main(String[] args) {
        short age = 28;
        if (age > 20) {
            System.out.println("Возраст больше 20");
        }

        char sex = 'W';
        boolean isSexMale = sex == 'M';
        if (isSexMale) {
            System.out.println("Пол мужской");
        }

        if (!isSexMale) {
            System.out.println("Пол не мужской");
        }

        float height = 1.70f;
        if (height < 1.80) {
            System.out.println("Рост больше 1,80");
        } else {
            System.out.println("Рост меньше 1,80");
        }

        char firstCharName = 'O';
        if (firstCharName == 'M') {
            System.out.println("Первая буква имени М");
        } else if (firstCharName == 'I') {
            System.out.println("Первая буква имени I");
        } else {
            System.out.println("Первая буква имени " + firstCharName);
        }
    }
}