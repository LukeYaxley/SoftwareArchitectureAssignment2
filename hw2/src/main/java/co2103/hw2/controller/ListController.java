package co2103.hw2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import co2103.hw2.repository.FilmRepository;
import co2103.hw2.repository.PersonRepository;
import co2103.hw2.repository.PremierRepository;
import co2103.hw2.repository.ShowingRepository;
import org.springframework.web.bind.annotation.*;

@Controller
public class ListController {
	@Autowired
	private FilmRepository filmrepo;
	@Autowired
	private PersonRepository personrepo;
	@Autowired
	private PremierRepository premierrepo;
	@Autowired
	private ShowingRepository showingrepo;

	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("films", filmrepo.findAll());
		model.addAttribute("people", personrepo.findAll());
		model.addAttribute("premiers", premierrepo.findAll());
		model.addAttribute("showings", showingrepo.findAll());
		System.out.println("MADE IT TO HERE");
		return "list";
	}

}
