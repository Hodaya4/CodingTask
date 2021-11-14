import java.util.Random;
import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int randomNumber = rand.nextInt(1000) + 1;
        System.out.println("A random number between 1000 and 1 has been chosen. Guess the number: ");
        int guesses = 0;
        int turn = 1;
        do {
            int userGuess = sc.nextInt();
            if (turn == 1) {
                guesses++;
            }
            if (userGuess == randomNumber) {
                break;
            }
            if (userGuess < randomNumber) {
                System.out.println("The random number is bigger. ");
            }
            if (userGuess > randomNumber) {
                System.out.println("The random number is smaller. ");
            }
            if (turn == 1) {
                turn = 2;
            } else {
                turn = 1;
            }

        } while (true);

        System.out.println("Player " + turn + " won after " + guesses + " guesses.");
    }
}
