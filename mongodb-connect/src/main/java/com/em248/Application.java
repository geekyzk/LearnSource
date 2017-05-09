package com.em248;

import com.em248.entity.User;
import com.em248.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner init(UserRepository userRepository) {

		return args -> {

//			User user = new User();
//			user.setPhone(13534142553L);
//			user.setUsername("tian");
//			user.setId(1L);
//			User db_user = userRepository.save(user);
//			System.out.println(db_user);

			User obj = userRepository.findOne(1L);
			System.out.println(obj);

			obj.setUsername("wu");
			User obj1 = userRepository.save(obj);
			System.out.println(obj1);
//			Domain obj2 = domainRepository.findFirstByDomain("mkyong.com");
//			System.out.println(obj2);
//
//			int n = domainRepository.updateDomain("mkyong.com", true);
//			System.out.println("Number of records updated : " + n);

		};

	}
}
