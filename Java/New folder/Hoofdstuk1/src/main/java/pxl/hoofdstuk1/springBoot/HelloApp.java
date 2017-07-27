package pxl.hoofdstuk1.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloApp {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new SpringApplication.run(AppConfig.class, args);
	}

}
