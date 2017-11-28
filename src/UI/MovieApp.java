package UI;
import java.util.List;

import business.Movie;
import business.MovieCollection;

public class MovieApp {

	public static void main(String[] args) {
		MovieCollection myMovies = new MovieCollection();
		myMovies.add(new Movie("Recent Movie",1997,4.2));
		myMovies.add(new Movie("Old Movie",1937,3.2));
		myMovies.add(new Movie("Old decent Movie",1927,3.7));
		myMovies.add(new Movie("New popular Movie",1967,4.7));
		myMovies.add(new Movie("New Unpopular Movie",1977,2.2));
		myMovies.add(new Movie("Old Unpopular Movie",1933,1.9));
		System.out.println("popular movies\n");
		List<Movie> popularMovies = myMovies.filterMovies(m -> m.getRating() >= 4);
		for(Movie m : popularMovies) {
			System.out.println(m.getTitle());
			System.out.println(m.getRating());
			System.out.println(m.getYear());
		}
		System.out.println("\nold movies\n");
		List<Movie> oldMovies = myMovies.filterMovies(m -> m.getYear() <= 1950);
		for(Movie m : oldMovies) {
			System.out.println(m.getTitle());
			System.out.println(m.getRating());
			System.out.println(m.getYear());
		}
		System.out.println("Movie rating data");
		System.out.println("Number of movies");
		System.out.println("Lowest rating: "+myMovies.getLowestRating());
		System.out.println("Highest rating: "+myMovies.getHighestRating());
		System.out.println("Average rating: "+myMovies.getAverageRating());
	}

}
