import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysExercises {
    public static void main(String[] args) {
//         This will display the address of the array
//         Arrays.toString is necessary for the purpose of displaying
//         the elements of the array
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);

        String[] people = { "Vanessa", "Tommy", "Amaro", "Tracy" };
        Person[] persons = {
                new Person(people[0]),
                new Person(people[1]),
                new Person(people[2]),
                new Person(people[3])
        };

//        for (Person person : persons) {
//            System.out.println(person.getName());
//        }

        Person newPerson = new Person("Trevor");

        persons = addPerson(persons, newPerson);
        for (Person person : persons) {
            System.out.println(person.getName());
        }

//        public class Main {
//            public static void main(String[] args) {
//                int[][] primes = new int[3][3];
//                primes[2][2] = 1;
//
//                System.out.println(primes[1][2]);
//            }
//public static void main(String[] args) {
//    List<Integer> numbers = new ArrayList<>();
//    numbers.add(13);
//    numbers.add(new Integer(8)); // Line 7
//    numbers.add(3.6); // Line 8
//    for (Integer number: numbers) System.out.println(number); // Line 9
//}
//        }
    }

    // addPerson Function
    public static Person[] addPerson(Person[] ppl, Person newPerson) {
        int newLength = ppl.length + 1;
        Person[] newCopy = Arrays.copyOf(ppl, newLength);
        int lastElem = newCopy.length - 1;
        newCopy[lastElem] = newPerson;
        return newCopy;
    }


//    public static void main(String[] args) {
//        Employee emp = new Employee("Peter Gibbons", "IT");
//        System.out.println(emp.getName() + "works in " + emp.getDepartment());
//    }
}


//class Employee extends Person {
//    private String department;
//
//    public Employee(String name, String department) {
//        super(name);
//        this.department = department;
//    }
//
//    public String getDepartment() {
//        return department;
//    }
//
//}
