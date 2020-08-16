import java.util.Arrays;

public class ServerNameGenerator {
//    Create two arrays whose elements are strings:
//    one with at least 10 adjectives,
//    another with at least 10 nouns.
    private String[] adjs = {
            "ambitious", "brave", "calm", "kind", "witty",
            "victorious", "happy", "eager", "elegant", "magnificent",
            "dedicated"
    };
    private String[] nouns = {
            "passion", "postman", "education", "knowledge", "research",
            "technology", "perspective", "friend", "patience", "problem",
            "photon"
    };

    // method that will return a random element from an array of strings.
    public String getRandomElement(String[] arr) {
        // generate a random number, then return random element in array
        int rand = (int) (Math.random() * arr.length);
        return arr[rand];
    }

    public static void main(String[] args) {
        // declare instance/object of class ServerNameGenerator
        ServerNameGenerator sname = new ServerNameGenerator();

        // select random adjective and noun
        String adj = sname.getRandomElement(sname.adjs);
        String noun = sname.getRandomElement(sname.nouns);

        System.out.println(String.format("\nHere is your server name:\n%s-%s", adj, noun));
    }
}
