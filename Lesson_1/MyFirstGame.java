public class MyFirstGame {
    public static void main(String[] args) {
        int number = 17;
        int numberPlayer = 50;
        int correct = 10;
        while (numberPlayer != number) {
            System.out.println(numberPlayer);
            if (numberPlayer > number) {
            System.out.println("Данное число больше того, что загадал компьютер");
            numberPlayer = numberPlayer - correct;
            } else {
            System.out.println("Данное число меньше того, что загадал компьютер");
            numberPlayer = numberPlayer + correct;
            }
            if (correct <= 1) {
                correct = 1;
            } else {
                correct--;
            }
        }
        System.out.println(numberPlayer);
        System.out.println("Поздравляю, число угадано!");
    }
}