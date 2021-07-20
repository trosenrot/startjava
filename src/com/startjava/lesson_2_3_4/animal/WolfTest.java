package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setName("Шарик");
        wolfOne.setSex("мальчик");
        wolfOne.setWeight(5.4f);
        wolfOne.setAge((byte)3);
        wolfOne.setColor("серый");

        System.out.println("Волка зовут " + wolfOne.getName());
        System.out.println("Его пол: " + wolfOne.getSex());
        System.out.println("Ему " + wolfOne.getAge() + " года(лет)");
        System.out.println("Он весит " + wolfOne.getWeight() + " кг");
        System.out.println("У него " + wolfOne.getColor() + " окрас");

        wolfOne.move();
        wolfOne.run();
        wolfOne.hunt();
        wolfOne.sit();
        wolfOne.howl();
    }
}