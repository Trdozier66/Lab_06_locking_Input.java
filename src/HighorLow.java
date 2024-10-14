import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int randomNumber = generator.nextInt(10) + 1;
        int guess = 0;
        boolean done = false;

        do {
            System.out.print("Guess the number (1-10): ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                if (guess < 1 || guess > 10) {
                    System.out.println("Please guess a number between 1 and 10.");
                } else {
                    done = true;
                }
            } else {
                System.out.println("Invalid input! Please enter an integer.");
                in.nextLine();
            }
        } while (!done);

        System.out.println("The random number was: " + randomNumber);
        if (guess < randomNumber) {
            System.out.println("Your guess is too low!");
        } else if (guess > randomNumber) {
            System.out.println("Your guess is too high!");
        } else {
            System.out.println("Congratulations! You guessed the correct number!");
        }

        in.close();
    }
}
