package pxl.hoofdstuk1.aspects;

import org.springframework.stereotype.Component;

@Component
public class MyBean implements MyInterface{

	public String sayHello(String name) {
		return "Hello " + name;
	}
	
	public String sayGoodbye(String name) {
		return "Goodbye " + name;
	}
}
