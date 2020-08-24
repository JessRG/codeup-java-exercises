package grades;

import java.util.ArrayList;
import java.util.Arrays;

// #1
public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // returns a shallow copy of student's grades
    public ArrayList<Integer> getGrades() {
        return (ArrayList) grades.clone();
//        String result = "";
//        for (Integer num : grades) {
//            result += String.format("%d\n", num);
//        }
//        return result;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for( Integer grade : grades ) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public static void main(String[] args) {
        // declare Student object(s)
        Student[] students = {
                new Student("Andrei"),
                new Student("Vanessa"),
                new Student("Tommy")
        };

        for(Student stud : students) {
            // generate random grades for students
            for (int i = 0; i < 5; i++) {
                stud.addGrade((int) (Math.random() * 101));
            }
        }

        for(Student stud : students) {
            for (Integer grade : stud.grades) {
                System.out.println(String.format("grade: %d", grade));
            }
            System.out.println(String.format("Average: %f", stud.getGradeAverage()));
        }
    }
}
