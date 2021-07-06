import java.util.Scanner;

public class JaegerTest {
    public static void main(String[] args) {
        Scanner stringConsole = new Scanner (System.in);
        Jaeger robotOne = new Jaeger();
        System.out.println("Первого робота зовут " + robotOne.getModelName());
        robotOne.move();

        System.out.println("Введите имя робота 1: ");
        String modelName = stringConsole.nextLine();
        robotOne.setModelName(modelName);
        System.out.println("Введите модель робота 1: ");
        String mark = stringConsole.nextLine();
        robotOne.setMark(mark);
        System.out.println("Введите страну производитель робота 1: ");
        String origin = stringConsole.nextLine();
        robotOne.setOrigin(origin);
        System.out.println("Введите рост робота 1: ");
        float height = stringConsole.nextFloat();
        robotOne.setHeight(height);
        System.out.println("Введите вес робота 1: ");
        float weight = stringConsole.nextFloat();
        robotOne.setWeight(weight);
        System.out.println("Введите силу робота 1: ");
        int strenght = stringConsole.nextInt();
        robotOne.setStrenght(strenght);
        System.out.println("Введите скорость робота 1: ");
        int speed = stringConsole.nextInt();
        robotOne.setSpeed(speed);
        System.out.println("Введите броню робота 1: ");
        int armor = stringConsole.nextInt();
        robotOne.setArmor(armor);
        System.out.println("Первого робота зовут " + robotOne.getModelName());
        robotOne.scanKaiju();

        stringConsole.nextLine();
        System.out.println("Введите имя робота 2: ");
        modelName = stringConsole.nextLine();
        System.out.println("Введите модель робота 2: ");
        mark = stringConsole.nextLine();
        System.out.println("Введите страну производитель робота 2: ");
        origin = stringConsole.nextLine();
        System.out.println("Введите рост робота 2: ");
        height = stringConsole.nextFloat();
        System.out.println("Введите вес робота 2: ");
        weight = stringConsole.nextFloat();
        System.out.println("Введите силу робота 2: ");
        strenght = stringConsole.nextInt();
        System.out.println("Введите скорость робота 2: ");
        speed = stringConsole.nextInt();
        System.out.println("Введите броню робота 2: ");
        armor = stringConsole.nextInt();
        Jaeger robotTwo = new Jaeger(modelName, mark, origin, height, weight, strenght, speed, armor);

        System.out.println("Второго робота зовут " + robotTwo.getModelName());
        robotTwo.move();
    }
}