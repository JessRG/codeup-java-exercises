import java.util.Scanner;

public class MethodsExercises {
    // #1 Basic Arithmetic

    /**
     * Create four separate methods. Each will perform an arithmetic operation:
     * Addition
     * Subtraction
     * Multiplication
     * Division
     * Add a modulus method that finds the modulus of two numbers
     */
    public static void main(String[] args) {
        try {
//            System.out.println(String.format("Addition: %d",addition(1, 4)));
//            System.out.println(String.format("Subtraction: %d", subtraction(6, 2)));
//            System.out.println(String.format("Multiplication: %d", multiplication(5, 4)));
//            System.out.println(String.format("Division: %d", division(30, 6)));
//            System.out.println(String.format("Modulus: %d", modulus(30, 5)));
//
//            System.out.print("Enter a number between 1 and 10: ");
//            int userInput = getInteger(1, 10);
//            long factorialNum = factorial(userInput);
//            System.out.println(factorialNum);

            diceGame();
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        /** BONUS */
//        return num1 * num2;
//        int sum = 0;
//        for(int i = 0; i < num2; i++) {
//            sum += num1;
//        }
//        return sum;
        if (num2 == 1) {
            return num1;
        }

        return num1 + multiplication(num1, num2 - 1);
    }
//
    public static int division(int num1, int num2) throws Exception {
        if (num2 == 0) {
            throw new Exception("Cannot divide by zero");
        }
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) throws Exception {
        if (num2 == 0) {
            throw new Exception("Cannot divide by zero");
        }
        return num1 % num2;
    }

    // #2
    /**
     * Create a method that validates that user input is in a certain range
     * */
    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        Integer input = scan.nextInt();

        if( (input < min || input > max) && input != null ) {
            System.out.print("Invalid Input: Enter a number between 1 and 10: ");
            input = getInteger(min, max);
        }
        return input;
    }

    // #3
    public static long factorial(int num) {
        if (num == 1) {
            return num;
        }
        return num * factorial(num - 1);
    }

    // #4
    public static void diceGame() {
        String rollDice = "";
        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter number of sides for pair of dice: ");
            int numSides = scan.nextInt();

            int die1 = rollDie(numSides);
            int die2 = rollDie(numSides);

            System.out.println(String.format("You rolled %d and %d for a total of %d", die1, die2, die1 + die2));

            System.out.print("Would you like to roll again? (Y/N)");
            rollDice = scan.next().toLowerCase();
            System.out.println(rollDice);

        } while(!rollDice.equals("n"));
        System.out.println("DiceGame done.");
    }

    public static int rollDie(int dieSides) {
        int rand = (int) (Math.random() * dieSides);
        return rand;
    }

//    public static void guessGame() {
//
//    }
}
