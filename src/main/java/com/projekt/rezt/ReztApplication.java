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
	}
}
