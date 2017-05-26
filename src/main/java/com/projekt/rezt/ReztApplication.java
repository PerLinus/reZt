package com.projekt.rezt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReztApplication implements CommandLineRunner{

	@Autowired
	private DatingProfileRepository datingProfileRepository;

	public static void main(String[] args) {
		SpringApplication.run(ReztApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {


		DatingProfile datingProfile1 = new DatingProfile();
		DatingProfile datingProfile2 = new DatingProfile();
		DatingProfile datingProfile3 = new DatingProfile();
		DatingProfile datingProfile4 = new DatingProfile();
		DatingProfile datingProfile5 = new DatingProfile();

		datingProfile1.setAge(23);
		datingProfile1.setUserName("eagerGamer");
		datingProfile1.setLength(175);
		datingProfile1.setInfo("Hello!");
		datingProfile1.setGamingHoursPerWeek(140);
		datingProfile1.setEnergyDrinksConsumedPerWeek(48);
		datingProfile1.setCity("Stockholm");
		datingProfile1.setHappiness(3);
		datingProfile1.setRager(true);

		datingProfile2.setAge(32);
		datingProfile2.setUserName("YummieChummie");
		datingProfile2.setLength(154);
		datingProfile2.setInfo("Hello!");
		datingProfile2.setGamingHoursPerWeek(32);
		datingProfile2.setEnergyDrinksConsumedPerWeek(21);
		datingProfile2.setCity("Stockholm");
		datingProfile2.setHappiness(10);
		datingProfile2.setRager(false);

		datingProfile3.setAge(67);
		datingProfile3.setUserName("nerdForLife");
		datingProfile3.setLength(205);
		datingProfile3.setInfo("Oldie but goldie!");
		datingProfile3.setGamingHoursPerWeek(70);
		datingProfile3.setEnergyDrinksConsumedPerWeek(0);
		datingProfile3.setCity("Stockholm");
		datingProfile3.setHappiness(5);
		datingProfile3.setRager(true);

		datingProfile4.setAge(18);
		datingProfile4.setUserName("WillingBilly");
		datingProfile4.setLength(178);
		datingProfile4.setInfo("Hello!");
		datingProfile4.setGamingHoursPerWeek(54);
		datingProfile4.setEnergyDrinksConsumedPerWeek(12);
		datingProfile4.setCity("Falun");
		datingProfile4.setHappiness(7);
		datingProfile4.setRager(false);

		datingProfile5.setAge(23);
		datingProfile5.setUserName("JimmyBoi");
		datingProfile5.setLength(176);
		datingProfile5.setInfo("Hello!");
		datingProfile5.setGamingHoursPerWeek(80);
		datingProfile5.setEnergyDrinksConsumedPerWeek(0);
		datingProfile5.setCity("Stockholm");
		datingProfile5.setHappiness(2);
		datingProfile5.setRager(true);

		datingProfileRepository.save(datingProfile1);
		datingProfileRepository.save(datingProfile2);
		datingProfileRepository.save(datingProfile3);
		datingProfileRepository.save(datingProfile4);
		datingProfileRepository.save(datingProfile5);




	}
}
