package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Movie[] movies = MoviesArray.findAll();
        Input userInput = new Input();
        do {
            int input;
            System.out.println(
                    String.format("\nWhat would you like to do?\n\n" +
                            "0 - exit\n1 - view all movies\n2 - view movies in the animated category\n" +
                            "3 - view movies in the drama category\n4 - view movies in the horror category\n" +
                            "5 - view movies in the scifi category\n6 - add a movie")
            );
            System.out.print("\nPlease enter an option: ");
            input = userInput.getInt();

            if(input == 1) {
                displayMovies(movies);
                userInput.getString();
            } else if(input == 2) {
                displayMovies(movies, "animated");
                userInput.getString();
            } else if(input == 3) {
                displayMovies(movies, "drama");
                userInput.getString();
            } else if(input == 4) {
                displayMovies(movies, "horror");
                userInput.getString();
            } else if(input == 5) {
                displayMovies(movies, "scifi");
                userInput.getString();
            } else if(input == 6) {
                userInput.getString();
                movies = addANewMovie(userInput, movies);
            }
        } while(userInput.yesNo("Would you like to continue? "));
    }

    // Display movies with single movie array parameter
    public static void displayMovies(Movie[] movies) {
        for(Movie movie : movies) {
            System.out.println(
                    String.format("\n%s -- %s", movie.getName(), movie.getCategory())
            );
        }
    }

    // Overload displayMovies
    // Display movies with two parameters
    public static void displayMovies(Movie[] movies, String category) {
        for(Movie movie : movies) {
            if(movie.getCategory().equals(category)) {
                System.out.println(
                        String.format("\n%s -- %s", movie.getName(), movie.getCategory())
                );
            }
        }
    }

    // Add movie to the movies array
    public static Movie[] addANewMovie(Input userInput, Movie[] movies) {
        System.out.print("Please type the title: ");
        String title = userInput.getString();
        System.out.print("Please type the category: ");
        String category = userInput.getString();
        Movie newMovie = new Movie(title, category.toLowerCase());
        return MoviesArray.addMovie(movies, newMovie);
    }
}
