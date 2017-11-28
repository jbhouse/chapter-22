package business;

public class Movie {

	private double rating;
	private String title;
	private int year;
	
	public Movie() {}
	
	public Movie(String title, int year, double rating) {
		this.title = title;
		this.year = year;
		this.rating = rating;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public double getRating() {
		return rating;
	}

	
	
}
