package grades;

import util.Input;

import java.util.*;

public class GroceryApplication {

    private HashMap<String, List<Grocery>> groceries;

    // Default constructor for GroceryApplication class
    public GroceryApplication() {
        String[] categories = {
                "Baby", "Beer,Wine & Spirits", "Beverages", "Bread & Bakery", "Breakfast & Cereal",
                "Canned Goods & Soups", "Condiments/Spices & Bake", "Cookies,Snacks & Candy", "Diary,Eggs & Cheese",
                "Deli & Signature Cafe", "Flowers", "Frozen Foods", "Produce: Fruits & Vegetables",
                "Grains,Pasta & Sides", "International Cuisine", "Meat & Seafood", "Miscellaneous", "Paper Products",
                "Cleaning Supplies", "Health & Beauty,Personal Care", "Pet Care", "Pharmacy", "Tobacco"
        };
        groceries = new HashMap<>();
        for (String category : categories) {
            List<Grocery> list = new ArrayList<>();
            groceries.put(category, list);
        }
    }

    // Getter method
    public HashMap<String, List<Grocery>> getGroceries() {
        return groceries;
    }

    // displayOrderedList method which will display the categories in alphabetical order
    public String displayOrderedList(Input scan) {
        Map<String, List<Grocery>> map = new TreeMap<>(groceries);
        Set<String> keys = map.keySet();
        List<String> listKeys = new ArrayList<>(keys);
        for (int i = 0; i < listKeys.size(); i++) {
            System.out.println(String.format("%d. %s", i + 1, listKeys.get(i)));
        }

        System.out.print("Select a category from the list: ");
        int selection = Integer.parseInt(scan.getString());

        return listKeys.get(selection-1);
    }

    // displayGroceries method that will display the groceries of each category
    // and sort that grocery list alphabetically
    public void displayGroceries() {
        Map<String, List<Grocery>> map = new TreeMap<>(groceries);
        for (Map.Entry category : map.entrySet()) {
            System.out.printf("\n%s:", category.getKey());

            // sort groceries
            ArrayList<Grocery> gl = ((ArrayList<Grocery>) category.getValue());
            Collections.sort(gl);

            // enhanced loop to display sorted grocery list
            for (Grocery elem : gl) {
                System.out.printf("\n\t%s %d", elem.getName(), elem.getQuantity());
            }
            System.out.println();
        }
    }

    // buildGroceryList method which will continuously prompt/finalize grocery list based off user choice;
    // this method will handle any new grocery item entries for a specific category
    public void buildGroceryList(Input input) {
        boolean choice = input.yesNo("Would you like to enter in a new item? ");

        if(choice) {
            do {
                // Given an ordered list of grocery categories to choose from, select the category.
                // Enter name of the item and quantity
                String key = displayOrderedList(input);

                if (groceries.containsKey(key)) {
                    System.out.print("\nEnter the item and quantity: (i.e roses, 11) ");

                    // split the string input with regex and ensure that the last string
                    // is parsed into the quantity
                    String[] userInput = input.getString().split("[ ,]+");
                    int quantity = Integer.parseInt(userInput[userInput.length - 1]);

                    // store the strings before the last string (quantity) of the user's input
                    // into new item string array and eventually join the item array with spaces
                    // as the item is added to the grocery list
                    String[] item = new String[userInput.length - 1];
                    for (int i = 0; i < userInput.length - 1; i++) {
                        item[i] = userInput[i];
                    }
                    List<Grocery> l = groceries.get(key);
                    l.add(new Grocery(String.join(" ", item), quantity));
                }
            } while(input.yesNo("\nWould you like to add another new item? "));
        }
        // Once the user finalizes the list, they will be presented with a complete list organized
        // alphabetically and grouped by category, and including quantity.
        displayGroceries();
    }

    // main method to run the Grocery Application
    public static void main(String[] args) {
        Input userInput = new Input();

        try {
            GroceryApplication groceryList = new GroceryApplication();

            boolean choice = userInput.yesNo("\nWould you like to create a grocery list? ");

            if (choice) {
                groceryList.buildGroceryList(userInput);
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
