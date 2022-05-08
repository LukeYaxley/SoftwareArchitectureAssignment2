package co2103.hw2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co2103.hw2.repository.FilmRepository;
import co2103.hw2.repository.PersonRepository;
import co2103.hw2.repository.PremierRepository;
import co2103.hw2.repository.ShowingRepository;

public class DeleteController {
	
	@Autowired
	private FilmRepository filmrepo;
	@Autowired
	private PersonRepository personrepo;
	@Autowired
	private PremierRepository premierrepo;
	@Autowired
	private ShowingRepository showingrepo;
	@GetMapping("/deleteFilm")
	public String deleteFilm(@RequestParam int id) {
		if (filmrepo.findById(id).isPresent()) {
			filmrepo.delete(filmrepo.findById(id).get());
		}
		return "redirect:/list";
	}
	@GetMapping("/deletePerson")
	public String deletePerson(@RequestParam int id) {
		if (filmrepo.findById(id).isPresent()) {
			filmrepo.delete(filmrepo.findById(id).get());
		}
		return "redirect:/list";
	}
	@GetMapping("/deleteShowing")
	public String deleteShowing(@RequestParam int id) {
		if (filmrepo.findById(id).isPresent()) {
			filmrepo.delete(filmrepo.findById(id).get());
		}
		return "redirect:/list";
	}
	@GetMapping("/deletePremier")
	public String deletePremier(@RequestParam int id) {
		if (filmrepo.findById(id).isPresent()) {
			filmrepo.delete(filmrepo.findById(id).get());
		}
		return "redirect:/list";
	}
}
