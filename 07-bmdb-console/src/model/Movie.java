package model;

//this is a class, aka Plain Old Java Object (POJO)
public class Movie {
//all instance variables are private Encapsulation
	private int id;
	private String title;
	private int year;
	private String rating;
	private String director;
	
	//to generate these, right click => source => generate
	//2a. need a default or empty constructor
	public Movie() {
		super();
	}

	//2b. need a fully loaded constructor
	public Movie(int id, String title, int year, String rating, String director) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.rating = rating;
		this.director = director;
	}

	//3. need getters/setters for all instance variables
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	//4. (optional) generate a toString()
	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", year=" + year + ", rating=" + rating + ", director="
				+ director + "]";
	}

}
