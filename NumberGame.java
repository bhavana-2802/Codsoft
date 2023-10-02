import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberOfAttempts = 0;
        int score = 0;
        boolean playAgain = true;

        while (playAgain) {
            int randomNumber = random.nextInt(100) + 1;
            int userGuess = 0;

            while (userGuess != randomNumber) {
                System.out.println("Guess a number between 1 and 100:");
                userGuess = scanner.nextInt();
                numberOfAttempts++;

                if (userGuess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low! Try again.");
                }
            }

            System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
            System.out.println("It took you " + numberOfAttempts + " attempts.");
            score += numberOfAttempts;
            numberOfAttempts = 0;

            System.out.println("Do you want to play again? (yes/no)");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Thank you for playing! Your final score is: " + score);
    }
}