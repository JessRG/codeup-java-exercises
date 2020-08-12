import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        String input = "";
        do {
            try {
                Scanner sc = new Scanner(System.in);

                System.out.print("Ask/Tell Bob something: ");
                input = sc.nextLine();

                String bobResp = bobResponse(input);
                System.out.println(bobResp);

                System.out.print("DM Bob again? ");
                input = sc.nextLine().toLowerCase();

            } catch(Exception ex) {
                System.out.println(ex.getMessage());
            }
        } while(!input.equals("n"));
    }

    public static String bobResponse(String input) {
        if(input.endsWith("?")) {
            return "Sure";
        } else if(input.endsWith("!")) {
            return "Whoa, chill out!";
        } else if(input.equals("")) {
            return "Fine. Be that way!";
        } else {
            return "Whatever.";
        }
    }
}
