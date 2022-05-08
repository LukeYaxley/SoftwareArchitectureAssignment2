package co2103.hw2.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Person {
	@Id
	@GeneratedValue
	private int id;

	public Person() {

	}

	public Person(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}

	private String name;
	private String role;
	@ManyToOne(cascade = CascadeType.ALL)
	private Film film;

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
		// List<Person> templist = film.getCast();
		// templist.add(this);
		// film.setCast(templist);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", role=" + role + "]";
	}
}
