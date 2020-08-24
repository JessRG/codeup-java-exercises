package grades;

import util.Input;

import java.util.*;

public class GroceryApplication {

    private HashMap<String, ArrayList<Grocery>> groceries;

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
            ArrayList<Grocery> list = new ArrayList<>();
            groceries.put(category, list);
        }
    }

//    public HashMap<String, ArrayList<Grocery>> getGroceries() {
//        return groceries;
//    }

    public void buildGroceryList(Input input) {
        boolean choice = input.yesNo("Would you like to enter a new item? ");

        if(choice) {
            do {
                // Given an ordered list of grocery categories to choose from, select the category.
                // Enter name of the item.
                //Enter how many of the item.
                displayOrderedList();
            } while(input.yesNo("\nWould you like to add an item? "));
        }
    }

    public void displayOrderedList() {
        Map<String, ArrayList<Grocery>> map = new TreeMap<>(groceries);
        for (HashMap.Entry category : map.entrySet()) {
            System.out.println(category.getKey());
        }
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
