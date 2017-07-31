package pxl.hoofdstuk2WebService.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

public class HelloApp {

	public static void main(String[] args) {
		SpringApplication.run(HelloApp.class, args);

	}
	
	@Bean
	public SimpleJaxWsServiceExporter exporter() {
		SimpleJaxWsServiceExporter exporter = new SimpleJaxWsServiceExporter();
		exporter.setBaseAddress("http://localhost/");
		return exporter;
	}

}
