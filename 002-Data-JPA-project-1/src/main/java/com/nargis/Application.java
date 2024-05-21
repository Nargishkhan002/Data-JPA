package com.nargis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nargis.entity.Player;
import com.nargis.repository.PlayerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		
		PlayerRepository playerRepository=context.getBean(PlayerRepository.class);
		
		Player p2=new Player();
		p2.setPlayerId(105);
		p2.setPlayerName("Jadhav");
		p2.setPlayerAge(45);
		p2.setLocation("Hyderabad");
		
		playerRepository.save(p2);
		System.out.println("Record Inserted...........");
	}

}
