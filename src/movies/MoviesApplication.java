package movies;

//import java.util.Arrays;
import java.util.Scanner;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Movie[] movies = MoviesArray.findAll();
        int input = -1;
        do {
            System.out.println(
                    String.format("What would you like to do?\n\n" +
                            "0 - exit\n1 - view all movies\n2 - view movies in the animated category\n" +
                            "3 - view movies in the drama category\n4 - view movies in the horror category\n" +
                            "5 - view movies in the scifi category")
            );
            System.out.print("\nPlease enter an option: ");
            input = scan.nextInt();

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
        } while(input != 0);
    }

    // Display movies with single movie array parameter
    public static void displayMovies(Movie[] movies) {
        for(Movie movie : movies) {
            System.out.println(
                    String.format("\nMovie Name: %s\nCategory: %s", movie.getName(), movie.getCategory())
            );
        }
    }

    // Overload displayMovies
    // Display movies with two parameters
    public static void displayMovies(Movie[] movies,String category) {
        for(Movie movie : movies) {
            if(movie.getCategory().equals(category)) {
                System.out.println(
                        String.format("\nMovie Name: %s\nCategory: %s", movie.getName(), movie.getCategory())
                );
            }
        }
    }
}
