import java.util.Scanner;
import java.util.Random;

public class Random_Number_Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int random_no = r.nextInt(100) + 1;
        int max_attempts = 5;
        int attempts = 0;
        boolean Guessed_Correctly = false;
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("You have " + max_attempts + " attempts to guess the correct number.");

        while (attempts < max_attempts && !Guessed_Correctly) {
            System.out.println("Enter your guess: ");
            int userGuess = sc.nextInt();
            attempts++;

            if (userGuess == random_no) {
                Guessed_Correctly = true;
                System.out.println("Congratulations! You guessed the correct number.");
            } else if (userGuess > random_no) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Too low! Try again.");
            }

            if (attempts == max_attempts && !Guessed_Correctly) {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + random_no);
            }
        }

        if (Guessed_Correctly) {
            System.out.println("You guessed the number in " + attempts + " attempts.");
        } else {
            System.out.println("Better luck next time!");
        }
        sc.close();
    }
}
