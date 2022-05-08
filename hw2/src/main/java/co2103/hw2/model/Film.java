package co2103.hw2.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Film {
	public Film() {

	}

	public Film(String title, Date releaseDate, String genre, int tickets_sold) {
		this.title = title;
		this.releaseDate = releaseDate;
		this.genre = genre;
		this.tickets_sold = tickets_sold;
		this.premier = null;
		this.cast = new ArrayList<>();
	}

	public Film(Premier premier, String title, Date releaseDate, String genre, int tickets_sold) {
		this.title = title;
		this.releaseDate = releaseDate;
		this.genre = genre;
		this.tickets_sold = tickets_sold;
		this.premier = premier;
		this.cast = new ArrayList<Person>();
	}

	@Id
	@GeneratedValue
	private int id;
	private String title;
	private Date releaseDate;
	private String genre;
	private int tickets_sold;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "premier")
	private Premier premier;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "film")
	private List<Person> cast;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "film")
	private List<Showing> showings;

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

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date date) {
		this.releaseDate = date;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getTickets_sold() {
		return tickets_sold;
	}

	public void setTickets_sold(int tickets_sold) {
		this.tickets_sold = tickets_sold;
	}

	public List<Person> getCast() {
		return cast;
	}

	public void setCast(List<Person> cast) {
		this.cast = cast;
		cast.forEach((i) -> {
			i.setFilm(this);
		});
	}

	public List<Showing> getShowings() {
		return showings;
	}

	public void setShowings(List<Showing> showings) {
		this.showings = showings;
	}

	public void setPremier(Premier premier) {
		this.premier = premier;
	}

	public Premier getPremier() {
		return premier;
	}

	@Override
	public String toString() {
		return "Film [id=" + id + ", title=" + title + ", date=" + releaseDate + ", genre=" + genre + ", tickets_sold="
				+ tickets_sold + ", showings=" + showings + "]";
	}

}
