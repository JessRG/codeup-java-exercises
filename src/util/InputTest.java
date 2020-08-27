package util;

public class InputTest {

    public static void main(String[] args) {

        Input input = new Input();
//        try {
            do {
//                input.getInt("Enter some integer number: ");
                input.getBinary();
                input.getHex();

            } while( input.yesNo("Do you want to enter some info again? (Y/N) ") );

//            do {
////                input.getDouble(1, 10);
////                System.out.print("Enter some double number: ");
////                String userInput = input.getString();
//                input.getDouble("Enter some double number: ");
//            } while( input.yesNo("Do you want to enter some info again? (Y/N) ") );
//        } catch(Exception ex) {
//            System.out.println(ex.getMessage());
//        }
    }
}
