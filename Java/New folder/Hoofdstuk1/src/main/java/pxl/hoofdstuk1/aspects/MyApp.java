package pxl.hoofdstuk1.aspects;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		MyInterface bean = ctx.getBean("myBean", MyInterface.class);
		System.out.println(bean.sayHello("Homer"));
		System.out.println(bean.sayGoodbye("homer"));
		ctx.close();
	}

}
