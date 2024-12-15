import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        System.out.println("Welcome to Guess the Number!");
        System.out.println("I have picked a number between 1 and 100. Try to guess it!");

        int userGuess = 0;
        int attempts = 0;

        do {
            System.out.println("Enter your guess:");

            if (input.hasNextInt()) {
                userGuess = input.nextInt();
                attempts++;

                if (userGuess < randomNumber) {
                    System.out.println("The number is higher.");
                } else if (userGuess > randomNumber) {
                    System.out.println("The number is lower.");
                } else {
                    System.out.println("Congratulations! You guessed it!");
                    System.out.println("You needed " + attempts + " attempts.");
                    break;
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.next();
            }
        } while (true);

        input.close();
    }
}
