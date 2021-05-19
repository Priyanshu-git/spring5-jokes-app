package spring.framework.spring5jokesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:templates/chuck-config.xml")
public class Spring5JokesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring5JokesAppApplication.class, args);
	}

}
