package util;

public class InputTest {

    public static void main(String[] args) {

        Input input = new Input();
        do {
            System.out.print("Enter some whole integer number: ");
            String userInput = input.getString();
            input.getInt(userInput);

        } while( input.yesNo() );

        do {
//            input.getDouble(1, 10);
            System.out.print("Enter some double number: ");
            String userInput = input.getString();
            input.getDouble(userInput);
        } while( input.yesNo() );
    }
}
