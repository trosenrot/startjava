import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner stringConsole = new Scanner(System.in);
        boolean continuation;
        do {
            int x;
            do {
                System.out.println("Введите первое число: ");
                x = stringConsole.nextInt();
            } while (!(calculator.setX(x)));

            char c;
            do {
                System.out.println("Введите знак математической операции: ");
                c = stringConsole.next().charAt(0);
            } while (!(calculator.setC(c)));

            int y;
            do {
                System.out.println("Введите второе число: ");
                y = stringConsole.nextInt();
            } while (!(calculator.setY(y)));

            calculator.Calculation();

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                String answer = stringConsole.next();
                if (answer.equals("yes")) {
                    continuation = true;
                    break;
                } else if (answer.equals("no")) {
                    continuation = false;
                    break;
                } else {
                    System.out.println("Некорректный ответ!");
                }
            } while (true); 
        } while (continuation);
    }
}