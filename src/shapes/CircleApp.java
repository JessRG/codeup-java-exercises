package shapes;

import util.Input;

public class CircleApp {
    // Declare static circle counter to count number of circles created
    private static int circleCount = 0;

    public static void main(String[] args) {
        // Declare the input object
        Input input = new Input();

        try {
            do {
                System.out.print("Enter the radius of the circle: ");
                String userInput = input.getString();

                // Get the radius from user input
                double rad = input.getDouble(userInput);

                // Create the circle
                Circle circle = new Circle(rad);
                circleCount++;

                System.out.println(
                        String.format("\nCircle's radius: %.3f\n\nCircle's area: %.3f\nCircle's circumference: %.3f\n", rad, circle.getArea(), circle.getCircumference())
                );
            } while( input.yesNo() );
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.printf("# of circle(s): %d", circleCount);
        }
    }
}
