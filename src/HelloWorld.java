public class HelloWorld {
    public static void main(String[] args) {
//        System.out.print("Hello");
//        System.out.print(" World");

        // Step #1:
        int myFavoriteNumber = 11;
//        System.out.println(myFavoriteNumber);

        // Step #2:
        String myString = "someStringValue";
//        System.out.println(myString);

        // Step #3:
//        myString = 'c'; // incompatible types :error

        // Step #4:
//        myString = 3.14159; // incompatible types :error

//        // Step #5:
//        long myNumber;
////        System.out.println(myNumber); // variable myNumber might not have been initialized :error
//
//        // Step #6:
////        myNumber = 3.14; // incompatible types :error
//
//        // Step #7:
//        myNumber = 123L;
//        System.out.println(myNumber);
//
//        // Step #8:
//        myNumber = 123;
//        System.out.println(myNumber);

        // Step #9:
//        float myNumber = 3.14; // incompatible types :error
        float myNumber = 3.14F;
//        float myNumber = (float) 3.14;
//        System.out.println(myNumber);

        // Step #10:
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        // Step #11:
//        String class = "someNewString"; // not a statement
//        System.out.println(class);

        // Step #12:
//        String theNumberThree = "three";
//        Object o = theNumberThree; // class java.lang.String cannot be cast to class java.lang.Integer
//        int three = (int) o;

//        int three = (int) "three"; // incompatible types: java.lang.String cannot be converted to int

        // Step #13:
//        int x = 4;
//        x = x + 5;

//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y = y * x;

//        int x = 3;
//        int y = 4;
//        x *= y;
//        System.out.println(x);

//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(x + " " + y);

        // Step #14
        int num1 = Integer.MAX_VALUE;
        int num2 = Integer.MIN_VALUE;
        System.out.println(++num1);
        System.out.println(--num2);
    }
}
