package co2103.hw2.repository;

import org.springframework.data.repository.CrudRepository;

import co2103.hw2.model.Film;

public interface FilmRepository extends CrudRepository<Film, Integer> {

}
