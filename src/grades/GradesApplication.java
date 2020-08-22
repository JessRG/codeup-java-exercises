package grades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        NameGenerator nameGen = new NameGenerator();

        // Create students array
        Student[] peeps = {
                new Student("Vanessa"),
                new Student("Tommy"),
                new Student("Tracy"),
                new Student("Ryan")
        };

        // generate random grades, add them to each student, then add to map
        for(Student stud : peeps) {
            for (int i = 0; i < 3; i++) {
                stud.addGrade((int) (Math.random() * 101));
            }
            ArrayList<String> names0 = nameGen.getAdjs();
            ArrayList<String> names1 = nameGen.getNouns();

            String word0 = nameGen.getRandomElement(names0);
            String word1 = nameGen.getRandomElement(names1);
            word1 = word1.substring(0,1).toUpperCase() + word1.substring(1);
            String username = String.format("%s%s", word0, word1);
            students.put(username, stud);
        }

//        for (HashMap.Entry mapElem : students.entrySet()) {
//            String github = mapElem.getKey().toString(),
//                    name = ((Student) mapElem.getValue()).getName(),
//                    grades = Arrays.toString(((Student) mapElem.getValue()).getGrades().toArray());
//            double avg = ((Student) mapElem.getValue()).getGradeAverage();
//            System.out.println(
//                    String.format("\nGithub: %s\nStudent Name: %s\nGrades: %s\nAverage: %f",
//                            github, name, grades, avg)
//            );
//        }
    }

    // define a function to be a command line interface
    public static void cli(HashMap<String, Student> studs) {}
}
