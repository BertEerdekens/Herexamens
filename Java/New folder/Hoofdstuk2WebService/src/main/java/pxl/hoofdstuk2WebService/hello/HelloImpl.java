package pxl.hoofdstuk2WebService.hello;

import org.springframework.stereotype.Service;

@Service("hello")
public class HelloImpl implements Hello{
	public String sayHello(String name) {
		return "Hello " + name;
	}
}
