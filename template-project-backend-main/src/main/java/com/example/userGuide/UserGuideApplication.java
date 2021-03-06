package com.example.userGuide;

import com.example.userGuide.model.User;
import com.example.userGuide.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserGuideApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(UserGuideApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String...args) throws Exception {
		this.userRepository.save(new User("Yangzekun", "Gao", "yangzekun_gao1@baylor.edu"));
	}
}
