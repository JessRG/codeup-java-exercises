package grades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    // Declare Scanner tool to help get the user's prompt entries
    private Scanner scan;

    // Default Constructor
    public GradesApplication() {
         scan = new Scanner(System.in);
    }

    // get the user's string input with Scanner
    public String getString() {
        return scan.nextLine();
    }

    // define a function to be a command line interface
    public void cli(HashMap<String, Student> studs) {

        System.out.println("Welcome!\n");
        System.out.println("Here are the Github usernames of our students:");
        displayUsernames(studs);

        do {
            String input = promptUser("\nWhat student would you like to see more information on?");

            if(studs.containsKey(input)) {
                System.out.println(
                        String.format(
                                "\nName: %s - Github Username: %s\nGrades: %s\nCurrent Average: %f\n",
                                studs.get(input).getName(), input,
                                studs.get(input).getGrades(), studs.get(input).getGradeAverage()
                        )
                );
            } else {
                System.out.println(
                        String.format("\nSorry, no student found with the Github username of \"%s\"\n", input)
                );
            }
        } while(yesNo());
    }

    // function to display the student usernames to the console
    public void displayUsernames(HashMap<String, Student> studs) {
        for (HashMap.Entry mapElem : studs.entrySet()) {
            String username = String.format("|%s| ", mapElem.getKey());
            System.out.print(username);
        }
        System.out.println();
    }

    // function to prompt the user for their input
    public String promptUser(String prompt) {
        System.out.println(String.format("%s\n", prompt));
        System.out.print("> ");
        String input = getString();
        return input;
    }

    // function to prompt the user for their input; will determine if application continues
    public boolean yesNo() {
        String input =  promptUser("Would you like to see another student? ");
        if(input.toLowerCase().equals("y") || input.toLowerCase().equals("yes"))
            return true;
        else {
            System.out.println("\nGoodbye, and have a wonderful day!");
            return false;
        }
    }

    // GradesApplication main function to compile/run application
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        NameGenerator nameGen = new NameGenerator();
        GradesApplication cmdLine = new GradesApplication();

        // Create students array
        Student[] peeps = {
                new Student("Vanessa"),
                new Student("Tommy"),
                new Student("Tracy"),
                new Student("Ryan")
        };

        // generate random grades, add them to each student
        for(Student stud : peeps) {
            for (int i = 0; i < 3; i++) {
                stud.addGrade((int) (Math.random() * 101));
            }
            // generate random usernames for each student
            ArrayList<String> names0 = nameGen.getAdjs();
            ArrayList<String> names1 = nameGen.getNouns();
            String word0 = nameGen.getRandomElement(names0);
            String word1 = nameGen.getRandomElement(names1);

            // capitalize first letter of second word in "Github" username
            word1 = word1.substring(0,1).toUpperCase() + word1.substring(1);

            // format the username into username string variable
            String username = String.format("%s%s", word0, word1);

            // store username (key) and the student object (value) in the map
            students.put(username, stud);
        }
        // command line interface for the user
        cmdLine.cli(students);
    }
}
