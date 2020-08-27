package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    // Default Constructor
    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    // function to determine whether to continue or end the
    public boolean yesNo(String prompt) {
        System.out.print(prompt);
        String input = getString();
        System.out.println();
        if (input.toLowerCase().equals("y") || input.toLowerCase().equals("yes")) {
            return true;
        } else {
            return false;
        }
    }

    // Get the user's input for integers
    public int getInt(int min, int max) {
        int input = 0;
        boolean incorrectInput;
        do {
            incorrectInput = false;
            try {
                input = getInt("Please enter in an integer: ");
            } catch(NumberFormatException e) {
                System.out.println("This is not an Integer");
                System.out.println();
                incorrectInput = true;
            }

        } while (input < min || input > max || !incorrectInput);
        return input;
    }

    // Overloading above method
    // Get the user's input with the option String parameter "prompt"
    public int getInt(String prompt) {
        System.out.print(prompt);
        return getInt();
//        return getBinary();
//        return getHex();
    }

    public int getInt() {
        String input = getString();
        int val = 0;
        try {
            val = Integer.valueOf(input);
        } catch(NumberFormatException e) {
            System.out.println(e.toString());
        }
        return val;
    }

    // Get the user's input for doubles
    public double getDouble(double min, double max) {
        double input;
        do {
            System.out.print("Please enter in a double value: ");
            input = getDouble();

        } while (input < min || input > max);
        return input;
    }

    // Overloading above method
    // Get the user's input with the option String parameter "prompt"
    public double getDouble(String prompt) {
        System.out.print(prompt);
        return getDouble();
    }

    public double getDouble() {
        String input = getString();
        double val = 0.0;

        try {
            val = Double.valueOf(input);
        } catch(NumberFormatException e) {
            System.out.println(e.toString());
        }
        return val;
    }

    public long getBinary() {
        System.out.print("Enter Binary number: ");
        String input = getString();
        long val = 0;

        try {
            val = Integer.valueOf(input, 2);
            System.out.println(String.format("Your number is %d", val));
        } catch(NumberFormatException e) {
            System.out.println(e.toString());
        }
        return val;
    }

    public long getHex() {
        System.out.print("Enter Hexadecimal: ");
        String input = getString();
        long val = 0;

        try {
            val = Integer.valueOf(input, 16);
            System.out.println(String.format("Your number is %d", val));
        } catch(NumberFormatException e) {
            System.out.println(e.toString());
        }
        return val;
    }
}
