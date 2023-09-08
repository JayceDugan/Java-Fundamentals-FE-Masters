package number_guessing;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    private static int guessNumber() {
        int upperbound = 3;
        Random rand = new Random();

        return rand.nextInt(upperbound);
    }

    public static void main(String args []) {
        int guesses = 0;
        int permittedGuesses = 5;
        int lastGuess = 0;
        int generatedNumber = guessNumber();
        Scanner scanner = new Scanner(System.in);

        while (guesses < permittedGuesses) {
            System.out.println("Guess:");
            lastGuess = scanner.nextInt();

            if (lastGuess == generatedNumber) {
                guesses = permittedGuesses;
                break;
            }

            guesses++;
        }

        if (lastGuess == generatedNumber) {
            System.out.println("You guessed correctly!");
        } else {
            System.out.println("You guessed incorrectly, the number was: " + generatedNumber);
        }

        /**
         * Cleanup
         */
        scanner.close();
    }
}
