import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int storedNumber = random.nextInt(100) + 1;  // Generates a random number between 1 and 100

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Try to guess the stored number between 1 and 100.");

        int guess;
        do {
            System.out.print("Please enter your guess: ");
            guess = scanner.nextInt();

            if (guess < storedNumber) {
                System.out.println("The stored number is greater than " + guess);
            } else if (guess > storedNumber) {
                System.out.println("The stored number is smaller than " + guess);
            } else {
                System.out.println("You have found the stored number " + storedNumber);
            }
        } while (guess != storedNumber);

        scanner.close();
    }
}
