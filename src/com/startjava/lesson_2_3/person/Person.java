package com.startjava.lesson_2_3.person;

public class Person {
    String sex = "man";
    String name = "Ivan";
    float height = 1.84f;
    float weight = 85.4f;
    byte age = 39;

    void move() {
        System.out.println("moving");
    }

    boolean sit() {
        System.out.println("sitting");
        return true;
    }

    void run() {
        System.out.println("running");
    }

    void say() {
        System.out.println(name + " says");
    }

    String learnJava() {
        return name + " learning Java";
    }
}