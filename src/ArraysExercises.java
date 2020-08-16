import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        // This will display the address of the array
        // Arrays.toString is necessary for the purpose of displaying
        // the elements of the array
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);

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
    }

    // addPerson Function
    public static Person[] addPerson(Person[] ppl, Person newPerson) {
        int newLength = ppl.length + 1;
        Person[] newCopy = Arrays.copyOf(ppl, newLength);
        int lastElem = newCopy.length - 1;
        newCopy[lastElem] = newPerson;
        return newCopy;
    }
}
