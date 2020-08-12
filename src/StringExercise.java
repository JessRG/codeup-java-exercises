public class StringExercise {
    public static void main(String[] args) {
        // #1
        String str = "We don't need no education";
        System.out.println(str);

        str = str.replace("education", "thought control");
        System.out.println(str);

        str = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(str);

        str = "In windows, the main drive is usually C:\\";
        System.out.println(str);

        str = "I can do backslashes \\, double backslashes \\\\,\nand the amazing" +
                " triple backslash \\\\\\!";
        System.out.println(str);
    }
}
