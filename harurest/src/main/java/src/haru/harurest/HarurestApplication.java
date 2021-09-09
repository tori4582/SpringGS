package src.haru.harurest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
	@SpringBootApplication:
		A shorthand to configure a class with:
		- @Configuration: The class will be a source of a bean definition for
				the application context.
		- @EnableAutoConfiguration: Tells SpringBoot to add beans based on 
				classpath settings, other beans, and other property settings.
		- @ComponentScan: tells Spring find other components, configs, services.
*/
@SpringBootApplication
public class HarurestApplication {

	public static void main(String[] args) {
		SpringApplication.run(HarurestApplication.class, args);
	}

}
