public class StringExercise {
    public static void main(String[] args) {
        // #1
        String str0 = "We don't need no education";
        System.out.println(str0);

        String str1 = str0.replace("education", "thought control");
        System.out.println(str0);

        String str2 = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(str2);

        String str3 = "In windows, the main drive is usually C:\\";
        System.out.println(str3);

        String str4 = "I can do backslashes \\, double backslashes \\\\,\nand the amazing" +
                " triple backslash \\\\\\!";
        System.out.println(str4);
    }
}
