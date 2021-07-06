import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner stringConsole = new Scanner(System.in);

        System.out.println("Введите имя первого игрока: ");
        Player playerOne = new Player(stringConsole.nextLine());
        System.out.println("Введите имя второго игрока: ");
        Player playerTwo = new Player(stringConsole.nextLine());
 
        boolean continuation = true;
        while (continuation) {
            GuessNumber game = new GuessNumber(playerOne, playerTwo);
            game.game();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]: ");
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
            } while(true); 
        }
    }
}