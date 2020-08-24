package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Grocery implements Comparable {
    private String name;
    private int quantity;

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    // Default constructor for Grocery class
    public Grocery(String name, int quantity) {
        setName(name);
        setQuantity(quantity);
    }

    @Override
    public int compareTo(Object o1) {
        return 0;
    }
}
