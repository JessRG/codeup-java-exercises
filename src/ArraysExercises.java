public class ArraysExercises {
    public static void main(String[] args) {
        // This will display the address of the array
        // Arrays.toString is necessary for the purpose of displaying
        // the elements of the array
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);

        String[] people = { "Vanessa", "Tommy", "Tracy" };
        Person[] persons = {
                new Person(people[0]),
                new Person(people[1]),
                new Person(people[2])
        };

        for (Person person : persons) {
            System.out.println(person.getName());
        }
    }

    // addPerson Function
//    public static Person[] addPerson(Person[] ppl, Person newPerson) {}
}
