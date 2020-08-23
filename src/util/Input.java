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
        if (input.toLowerCase().equals("y") || input.toLowerCase().equals("yes")) {
            return true;
        } else {
            return false;
        }
    }

    // Get the user's input for integers
    public int getInt(int min, int max) {
        int input;
        do {
            input = getInt("Please enter in an integer: ");

        } while (input < min || input > max);
        return input;
    }

    // Overloading above method
    // Get the user's input with the option String parameter "prompt"
    public int getInt(String prompt) {
        System.out.print(prompt);
        return getInt();
    }

    public int getInt() {
        return scanner.nextInt();
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
        double input = Double.parseDouble(prompt);
        return input;
    }

    public double getDouble() {
        return scanner.nextDouble();
    }
}
