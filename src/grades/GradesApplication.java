package grades;

import java.security.Key;
import java.util.*;

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

        System.out.println("\nWelcome!\n");

        do {
            String menu = "Please make a selection: \n\n0 - exit\n1 - Search for student\n2 - Show all student grades";
            int selection = Integer.parseInt(promptUser(menu));

            if (selection == 1) {
                displayStudents(studs, 0);
                do {
                    String input = promptUser("What student would you like to see more information on?");
                    input = checkInput(input, studs.keySet());

                    if(studs.containsKey(input)) {
                        System.out.println(
                                String.format(
                                        "Name: %s - Github Username: %s\nGrades: %s\nCurrent Average: %f\n",
                                        studs.get(input).getName(), input,
                                        studs.get(input).getGrades(), studs.get(input).getGradeAverage()
                                )
                        );
                    } else if(input.equals("1")) {
                        displayStudents(studs, 1);
                    } else {
                        System.out.println(
                                String.format("Sorry, no student found with the Github username of \"%s\"\n", input)
                        );
                    }
                } while(yesNo("Would you like to see another student? "));
            } else if(selection == 2) {
                displayStudents(studs, 1);
            } else {
                break;
            }
        } while(yesNo("Would you like to select from the menu again? "));

    }

    // function to check the user's input (case insensitive)
    public String checkInput(String input, Set<String> keys) {
        String result = input;
        for(String key : keys) {
            if (input.equalsIgnoreCase(key)) {
                result = key;
                break;
            }
        }
        return result;
    }

    // function to display the student usernames to the console
    public void displayStudents(HashMap<String, Student> studs, int choice) {
        String printString;
        for (HashMap.Entry mapElem : studs.entrySet()) {
            switch(choice) {
                case 0:
                     printString = String.format("|%s| ", mapElem.getKey());
                    System.out.print(printString);
                    break;
                case 1:
                    printString = String.format("\nGithub Username: %s\nGrades: %s",
                            mapElem.getKey(), ((Student) mapElem.getValue()).getGrades());
                    System.out.println(printString);
                    break;
            }
        }
        System.out.println();
    }

    // function to prompt the user for their input
    public String promptUser(String prompt) {
        System.out.println(String.format("%s\n", prompt));
        System.out.print("> ");
        String input = getString();
        System.out.println();
        return input;
    }

    // function to prompt the user for their input; will determine if application continues
    public boolean yesNo(String prompt) {
        String input =  promptUser(prompt);
        if(input.toLowerCase().equals("y") || input.toLowerCase().equals("yes"))
            return true;
        else {
            System.out.println("Goodbye, and have a wonderful day!\n");
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
