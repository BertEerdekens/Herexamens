package pxl.hoofdstuk1.cleaningv2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HouseApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CleaningService jill = ctx.getBean("jill", CleaningService.class);
		CleaningService jane = ctx.getBean("jane", CleaningService.class);
		
		jill.clean();
		jane.clean();
		
		ctx.close();
	}
}
