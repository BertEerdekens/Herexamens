package pxl.hoofdstuk1.springBoot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hello")
public class HelloImpl implements Hello{

	@Value("${name}")
	private String name;
	
	public String sayHello() {
		return "Hello " + name;
	}
}
