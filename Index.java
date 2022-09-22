/*
 *
 * The program asks the user to guess a number
 *
 * @author:  Michael Clermontl
 * @version: 1.0
 * @since:   2022-10-20
*/

import java.util.Random;
import java.util.Scanner;

/**
* This is the starting of main program.
*/
public final class Index {
    /**
     * The utility class lint exception rule.
     *
    */

    private Index() {
        // nothing called
    }
    /**
    * The starting main() function.
    *
    * @param args No args will be used.
    */

    public static void main(final String[] args) {

        int loopNumber = 0;
        final Random rand = new Random();
        final int random = rand.nextInt(6) + 1;
        final String correct = "You guessed the number in %d times!";
        while (true) {
            final Scanner sc = new Scanner(System.in);
            System.out.print("Guess a number between 1 to 6: ");
            final int userNumber = sc.nextInt();
            loopNumber++;
            if (userNumber == random) {
                System.out.printf(correct, loopNumber);
                break;
            } else if (random > userNumber) {
                System.out.println("Next time guess higher!");
            } else if (random < userNumber) {
                System.out.println("Next time guess lower!");
            } else {
                System.out.println("Invalid input.");
            }
        }
        System.out.println("\nDone.");
    }
}
