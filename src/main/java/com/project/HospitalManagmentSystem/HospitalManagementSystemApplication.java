package com.project.HospitalManagmentSystem;


import com.project.HospitalManagmentSystem.entity.User;
import com.project.HospitalManagmentSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;


@SpringBootApplication
public class HospitalManagementSystemApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	PasswordEncoder passwordEncoder;
	public static void main(String[] args) {
		SpringApplication.run(HospitalManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();
		userRepository.save(new User("User",passwordEncoder.encode("password"),"USER"));
		userRepository.save(new User("Admin",passwordEncoder.encode("password"),"ADMIN"));
	}

}
