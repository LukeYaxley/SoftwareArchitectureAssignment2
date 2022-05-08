package co2103.hw2.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Premier {
	@Id
	@GeneratedValue
	private int id;
	private Date date;
	private Time time;
	private String address;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "film")
	private Film film;

	public Premier() {

	}

	public Premier(Film film, Date date, Time time, String address) {
		this.date = date;
		this.time = time;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
		film.setPremier(this);
	}

	@Override
	public String toString() {
		return "Premier [id=" + id + ", date=" + date + ", time=" + time + ", address=" + address + "]";
	}

}
