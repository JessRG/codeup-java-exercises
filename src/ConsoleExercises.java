import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;

        // The value of pi is approximately 3.14.
        System.out.print(String.format("The value of pi is approximately %.2f.\n", pi));

        // #1
//        System.out.println("Please enter an integer");
        Scanner scan = new Scanner(System.in);
//        int num0 = scan.nextInt(); // An Exception occurs: Exception in thread "main" java.util.InputMismatchException
//        System.out.print(String.format("You entered: %d\n", num0));

        // #2
//        System.out.print("Please enter 3 words: ");
//        String str0 = scan.next();
//        String str1 = scan.next();
//        String str2 = scan.next();
//        System.out.println(String.format("str0: %s str1: %s str2: %s\n",str0, str1, str2)); // the strings after the third token are ignored

        // #3
//        System.out.print("Please enter a sentence: ");
//        String str3 = scan.next(); // This does not capture all the words
        // #4
//        String str3 = scan.nextLine(); // This captures the whole string
//        System.out.printf("The sentence you just entered: %s", str3);

        System.out.print("Please enter the length and width of a classroom at Codeup: ");
        String input = scan.nextLine();
        String[] inputStr = input.split(" ");
        int length = Integer.parseInt(inputStr[0]);
        int width = Integer.parseInt(inputStr[1]);
        System.out.println(String.format("area of rectangle: %d\nperimeter of rectangle: %d", length * width, 2 * length + 2 * width));

        // The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
    }
}