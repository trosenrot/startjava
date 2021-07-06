import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int secretNumber;
    private int playerNumber;
    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void game(){
            Scanner stringConsole = new Scanner(System.in);
            Random random = new Random();
            secretNumber = random.nextInt(100);
        do {
            System.out.println(playerOne.getName() + " введите число: ");
            playerNumber = stringConsole.nextInt();
            if (playerNumber > secretNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (playerNumber < secretNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                break;
            }
            System.out.println(playerTwo.getName() + " введите число: ");
            playerNumber = stringConsole.nextInt();
            if (playerNumber > secretNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (playerNumber < secretNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                break;
            }
        } while(true);
        System.out.println("Поздравляю, число угадано!");
    }
}