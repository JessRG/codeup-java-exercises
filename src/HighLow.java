import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        int pickNum = (int) (Math.random() * 100);
        int count = 0,
            upperLimit = 10;

        try {
            Scanner scan = new Scanner(System.in);
            int guess = -1;
            do {
                System.out.print("Make a guess: ");
                guess = scan.nextInt();

                if (guess != pickNum) {
                    if (guess > pickNum) {
                        System.out.println("HIGHER");
                    } else {
                        System.out.println("LOWER");
                    }
                    count++;
                } else {
                    System.out.println(String.format("GOOD GUESS! # of guesses: %d", count));
                }
            } while(guess != pickNum && count < upperLimit);
        } catch(Exception ex) {
            ex.getMessage();
        } finally {
            if (count >= upperLimit) {
                System.out.println("You ran out of guess attempts.");
            }
        }
    }
}
