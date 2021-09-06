package com.codeclan.example.pirateservice;

import com.codeclan.example.pirateservice.models.Pirate;
import com.codeclan.example.pirateservice.repositories.PirateRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PirateserviceApplicationTests {

	@Autowired //using dependency injection aka passing an object to another part of the program, PirateRepository can take an object and save it into the database
	PirateRepository pirateRepository; //importing the repository for use in tests

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreatePirate(){
		Pirate testPirate = new Pirate("David", "Brown", 32);
		pirateRepository.save(testPirate);
	}

}
