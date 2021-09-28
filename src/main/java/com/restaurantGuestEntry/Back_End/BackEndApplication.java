package com.restaurantGuestEntry.Back_End;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.restaurantGuestEntry.Back_End.Service.*"})
//@EntityScan("com.delivery.domain")
//@EnableJpaRepositories("com.delivery.repository")
public class BackEndApplication {
	public BackEndApplication(){

	}

	public static void main(String[] args) {
		SpringApplication.run(BackEndApplication.class, args);
	}

}
