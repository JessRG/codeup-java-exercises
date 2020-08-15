public class ArraysExercises {
    public static void main(String[] args) {
        // This will display the address of the array
        // Arrays.toString is necessary for the purpose of displaying
        // the elements of the array
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);

        Person[] persons = new Person[3];
        String[] people = { "Vanessa", "Tommy", "Tracy" };

        for (int i = 0; i < people.length; i++) {
            persons[i] = new Person(people[i]);
            System.out.println(persons[i].getName());
        }
    }

    // addPerson Function
//    public static Person[] addPerson(Person[] ppl, Person newPerson) {}
}
