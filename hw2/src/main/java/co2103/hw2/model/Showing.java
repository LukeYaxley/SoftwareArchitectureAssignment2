package co2103.hw2.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.*;

@Entity
public class Showing {
	@Id
	@GeneratedValue
	private int id;
	private Date date;
	private Time time;
	private int screen_number;
	private int seats_remaining;
	@ManyToOne(fetch = FetchType.LAZY)
	private Film film;

	public Showing() {

	}

	public Showing(Film film, Date date, Time time, int screen_number, int seats_remaining) {
		this.date = date;
		this.time = time;
		this.screen_number = screen_number;
		this.seats_remaining = seats_remaining;
		this.film = film;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public int getScreen_number() {
		return screen_number;
	}

	public void setScreen_number(int screen_number) {
		this.screen_number = screen_number;
	}

	public int getSeats_remaining() {
		return seats_remaining;
	}

	public void setSeats_remaining(int seats_remaining) {
		this.seats_remaining = seats_remaining;
	}

	@Override
	public String toString() {
		return "Showing [id=" + id + ", date=" + date + ", time=" + time + ", screen_number=" + screen_number
				+ ", seats_remaining=" + seats_remaining + ", film=" + film.getTitle() + "]";
	}
}
