package pxl.hoofdstuk1.cleaningv2;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public CleaningTool broom() {
		return new Broom();
	}
	
	@Bean
	public CleaningTool vacuum() {
		return new VacuumCleaner();
	}
	
	@Bean
	public CleaningService jill() {
		CleaningServiceImpl cs = new CleaningServiceImpl();
		cs.setCleaningTool(broom());
		return cs;
	}
	
	@Bean
	public CleaningService jane() {
		CleaningServiceImpl cs = new CleaningServiceImpl();
		cs.setCleaningTool(vacuum());
		return cs;
	}
	
	@Bean
	public GardeningTool lawnMower() {
		return new LawnMower();
	}
	
	@Bean(autowire=Autowire.BY_TYPE)
	public GardeningService scott() {
		GardeningServiceImpl gs = new GardeningServiceImpl();
		gs.setGardeningTool(lawnMower());
		return gs;
	}
}
