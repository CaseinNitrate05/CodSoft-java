import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String args[]) {
        int guess;
        Random random = new Random();
        int number = random.nextInt(1, 100);
        System.out.println("random number:" + number);

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("--------------------------------");

            System.out.print("Enter your guess:");
            guess = input.nextInt();
            if (number > guess) {
                System.out.println("Too Low");
            }
            if (number < guess) {
                System.out.println("Too High");
            }
            if (number == guess) {
                System.out.println("Correct -> +1");
                break;
            }

        }
    }
}
