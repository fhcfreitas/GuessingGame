import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int secretNumber = new Random().nextInt(100);
        Scanner reader = new Scanner(System.in);
        int attempts = 0;

        while (attempts < 5) {
            System.out.println("Try a number from 0 to 100:");
            int guessNumber = reader.nextInt();
            attempts++;

            if (guessNumber == secretNumber) {
                System.out.println("Congrats, you win!");
                break;
            } else if (guessNumber < secretNumber) {
                System.out.println("You guess is lower than the number. ");
            } else {
                System.out.println("Your guess is higher than the number.");
            }
        }

        if (attempts == 5) {
            System.out.println("You reached 5 attemps. You lost.");
        }
    }
}