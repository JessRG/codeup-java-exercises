package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    // Default Constructor
    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.next().toLowerCase();
    }

    public boolean yesNo() {
        System.out.print("Do you want to continue inputting a number? ");
        String input = getString();
        if (input.equals("y") || input.equals("yes")) {
            return true;
        } else {
            return false;
        }
    }

    // Get the user's input
    public int getInt(int min, int max) {
        int input;
        do {
            System.out.print("Please enter in an integer: ");
            input = getInt();

        } while (input < min || input > max);
        return input;
    }

    // Overloading above method
    // Get the user's input with the option String parameter "prompt"
    public int getInt(String prompt) {
        System.out.println(prompt);
        int input = Integer.parseInt(prompt);
        return input;
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double input;
        do {
            System.out.print("Please enter in a double value: ");
            input = getDouble();

        } while (input < min || input > max);
        return input;
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        double input = Double.parseDouble(prompt);
        return input;
    }

    public double getDouble() {
        return scanner.nextDouble();
    }
}
