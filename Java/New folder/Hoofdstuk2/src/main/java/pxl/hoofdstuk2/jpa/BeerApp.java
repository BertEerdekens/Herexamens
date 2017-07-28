package pxl.hoofdstuk2.jpa;

import javax.persistence.EntityManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import pxl.hoofdstuk2.beerJDBC.BeerAppConfig;

public class BeerApp {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(BeerAppConfig.class, args);
		
		BeerRepository br = ctx.getBean("beerRepository", BeerRepository.class);
		
		
		Beer beer = br.getBeerById(20);
		System.out.println(beer);
	}

}
