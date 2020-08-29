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

    public void buildGroceryList(Input input) {
        boolean choice = input.yesNo("Would you like to enter in a new item? ");

        if(choice) {
            do {
                // Given an ordered list of grocery categories to choose from, select the category.
                // Enter name of the item and quantity
                String key = displayOrderedList(input);

                if (groceries.containsKey(key)) {
                    System.out.print("\nEnter the item and quantity: (i.e roses, 11) ");
                    String[] userInput = input.getString().split(", ");
                    int quantity = Integer.parseInt(userInput[1]);
                    List<Grocery> l = groceries.get(key);
                    l.add(new Grocery(userInput[0], quantity));
                }

                groceries.get(key).forEach((elem) -> System.out.print("\n" + elem.getName()));
            } while(input.yesNo("\nWould you like to add a new item? "));
        }
    }

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

    public static void main(String[] args) {
        Input userInput = new Input();
        GroceryApplication groceryList = new GroceryApplication();

        boolean choice = userInput.yesNo("\nWould you like to create a grocery list? ");

        if (choice) {
            groceryList.buildGroceryList(userInput);
        }
    }
}
