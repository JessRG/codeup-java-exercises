package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        scanner.nextLine().toLowerCase();
        if (scanner.nextLine().equals("y") || scanner.nextLine().equals("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        int input;
        do {
            System.out.println("Please enter in an integer: ");
            input = getInt();



        } while();

        return input;
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        return scanner.nextDouble();
    }

    public double getDouble() {
        return scanner.nextDouble();
    }
}
