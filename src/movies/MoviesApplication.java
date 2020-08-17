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
                            "5 - view movies in the scifi category")
            );
            System.out.print("\nPlease enter an option: ");
            input = userInput.getInt();

            if(input == 1) {
                displayMovies(movies);
            } else if(input == 2) {
                displayMovies(movies, "animated");
            } else if(input == 3) {
                displayMovies(movies, "drama");
            } else if(input == 4) {
                displayMovies(movies, "horror");
            } else if(input == 5) {
                displayMovies(movies, "scifi");
            }
        } while(userInput.yesNo());
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
}
