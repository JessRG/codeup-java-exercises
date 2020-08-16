package movies;

public class Movie {
    private String name;
    private String category;

    // setters and getters (modifiers/accessors)
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    // constructor
    public Movie(String name, String category) {
        setName(name);
        setCategory(category);
    }
}
