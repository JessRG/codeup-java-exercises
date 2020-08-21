package grades;

import java.util.ArrayList;

public class NameGenerator {
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

    private ArrayList<String> listAdjs = new ArrayList<>();
    private ArrayList<String> listNouns = new ArrayList<>();

    public NameGenerator() {
        for (int i = 0; i < adjs.length; i++) {
            listAdjs.add(adjs[i]);
            listNouns.add(nouns[i]);
        }
    }

    // getter for String arrays listAdjs and nouns
    public ArrayList<String> getAdjs() {
        return listAdjs;
    }

    public ArrayList<String> getNouns() {
        return listNouns;
    }

    // method that will return a random element from an array of strings.
    public String getRandomElement(ArrayList<String> list) {

        // generate a random number, then return random element in ArrayList
        int rand = (int) (Math.random() * list.size());
        String word = list.get(rand);
        removeWord(word, list);
        return word;
    }

    // method that will remove a String value from the ArrayList listAdjs
    public void removeWord(String word, ArrayList<String> list) {
        list.remove(word);
    }

//    public static void main(String[] args) {
//        // declare instance/object of class ServerNameGenerator
//        NameGenerator sname = new NameGenerator();
//
//        // select random adjective and noun
//        String adj = sname.getRandomElement(sname.adjs);
//        String noun = sname.getRandomElement(sname.nouns);
//
//        // hyphenate random adjective and noun combo and display on the console
//        System.out.println(String.format("\nHere is your server name:\n%s-%s", adj, noun));
//    }
}
