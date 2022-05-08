package co2103.hw2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co2103.hw2.model.*;
import co2103.hw2.repository.FilmRepository;
import co2103.hw2.repository.PersonRepository;
import co2103.hw2.repository.PremierRepository;
import co2103.hw2.repository.ShowingRepository;

import java.sql.Date;
import java.sql.Time;

@SpringBootApplication
public class Hw2Application implements ApplicationRunner {
	@Autowired
	private FilmRepository filmrepo;
	@Autowired
	private PersonRepository personrepo;
	@Autowired
	private PremierRepository premierrepo;
	@Autowired
	private ShowingRepository showingrepo;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Hw2Application.class, args);

	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Person Tobey = new Person("Tobey Maguire", "Actor");
		Film Spiderman1 = new Film("Spiderman", new Date(2002 - 04 - 29), "Action", 100);
		Premier Spiderman_Premier = new Premier(Spiderman1, new Date(2002 - 04 - 27), new Time(20, 30, 00), "New York");
		Spiderman1.setPremier(Spiderman_Premier);
		Tobey.setFilm(Spiderman1);
		personrepo.save(Tobey);
		filmrepo.save(Spiderman1);
		Spiderman_Premier.setFilm(Spiderman1);
		premierrepo.save(Spiderman_Premier);
		Showing Spiderman1Showing = new Showing(Spiderman1, new Date(2003 - 04 - 31), new Time(20, 30, 00), 3, 20);
		showingrepo.save(Spiderman1Showing);
		Person Christian = new Person("Christian Bale", "Actor");
		Film Batman = new Film("Batman", new Date(2008 - 03 - 29), "Action", 10);
		Premier Batman_Premier = new Premier(Batman, new Date(2008 - 03 - 27), new Time(20, 30, 00), "Los Angeles");
		Batman.setPremier(Batman_Premier);
		Christian.setFilm(Batman);
		personrepo.save(Christian);
		filmrepo.save(Batman);
		Batman_Premier.setFilm(Batman);
		premierrepo.save(Batman_Premier);
		Showing BatmanShowing = new Showing(Batman, new Date(2009 - 04 - 31), new Time(20, 30, 00), 4, 25);
		showingrepo.save(BatmanShowing);

	}

}
