import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        whileLoop();
//        doWhileLoopByTwos();
//        doWhileLoopByFives();
//        doWhilePowerOfTwos();
//        forLoopRefactor();
//        fizzBuzz();
//        tableOfPowers();
        gradesToLetters();
    }

    // #1
    public static void whileLoop() {
        int i = 5;
        while(i <= 15) {
            System.out.print(" " + i++);
        }
    }

    public static void doWhileLoopByTwos() {
        int i = 0;
        do {
            System.out.println(i);
            i+=2;
        } while(i <= 100);
    }

    public static void doWhileLoopByFives() {
        int i = 100;
        do {
            System.out.println(i);
            i -= 5;
        } while(i >= -10);
    }

    public static void doWhilePowerOfTwos() {
        long i = 2;

        do {
            System.out.println(i);
            i *= i;
        } while(i < 1000000);
    }

    public static void forLoopRefactor() {
        // a.
        for (int i = 5; i <= 15; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
        // end of a.

        // b.
        for (int i = 0; i <= 100; i+=2) {
            System.out.println(i);
        }

        for (int i = 100; i >= -10; i -= 5) {
            System.out.println(i);
        }

        for (long i = 2; i < 1000000; i*=i) {
            System.out.println(i);
        }
        // end of b.
    }

    // #2
    public static void fizzBuzz() {
        for (int i = 0; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0) {
                System.out.println("Fizz");
            } else if(i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
    // #3
    public static void tableOfPowers() {
        Scanner scan = new Scanner(System.in);

        System.out.print("What number would you like to go up to? ");
        int inputNum = scan.nextInt();

        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for (int i = 0; i < inputNum; i++) {
            int number = i+1;
            int squared = number * number;
            int cubed = squared * number;
            System.out.println(String.format("%d\t   | %d\t\t | %d", number, squared, cubed));
        }
    }

    // #4
    public static void gradesToLetters() {
        Scanner scan = new Scanner(System.in);
        try {
            String ans = "y";

            do {
                System.out.print("Enter a number from 0 to 100? ");
                int n = scan.nextInt();
                System.out.println( (n <= 100 && n >= 88)? 'A':
                        (n < 88 && n >= 80)? 'B':
                                (n < 80 && n >= 67)? 'C':
                                        (n < 67 && n >= 60)? 'D': 'F');

                System.out.println("Do you want to get another letter grade? (y or n)");
                 ans = scan.nextLine().toLowerCase();
                 scan.nextLine();

            } while(ans == "y");
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
