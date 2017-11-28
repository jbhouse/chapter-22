//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MovieCollection {
	
	private List<Movie> allMovies;

	public MovieCollection() {
		allMovies = new ArrayList<>();
	}
	
	public List<Double> allRatings() {
		return allMovies.stream().map(Movie::getRating).collect(Collectors.toList());
	}

	public List<Movie> getAllMovies() {
		return allMovies;
	}

	public void setAllMovies(List<Movie> allMovies) {
		this.allMovies = allMovies;
	}
	
	public void add(Movie movie) {
		allMovies.add(movie);
	};
	public List<Movie> filterMovies(Predicate<Movie> condition){
		return allMovies.stream().filter(condition).collect(Collectors.toList());
	};
	public double getLowestRating() {
		return Collections.max(allRatings());
	};
	public double getHighestRating() {
		return Collections.min(allRatings());
	};
	public double getAverageRating() {
		double startValue = 0.0;
		return allRatings().stream().reduce(startValue, Double::sum)/allRatings().size();
	};
	public int getSize() {
		return allMovies.size();
	};
//	public List<Movie> recentMovies(){
//		return allMovies.stream().filter(m -> m.getYear() > 1990).collect(Collectors.toList());
//	}
	
}
