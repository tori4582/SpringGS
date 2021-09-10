package src.haru.harurest;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

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

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext context) {
		return (args) -> {
			System.out.println("Inspecting Beans provided by Spring Boot:");

			String[] beanNames = context.getBeanDefinitionNames();
			Arrays.sort(beanNames);

			for (String beanName : beanNames) {
				System.out.println(beanName);
			}
		};
	}

}
