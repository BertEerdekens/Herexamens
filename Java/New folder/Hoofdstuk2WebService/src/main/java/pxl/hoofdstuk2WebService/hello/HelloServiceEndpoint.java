package pxl.hoofdstuk2WebService.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.WebMethod;
import javax.jws.WebResult;


@Service
@WebService(serviceName="Hello")
@SOAPBinding
public class HelloServiceEndpoint {
	
	@Autowired	
	private Hello helloService;
	
	@Autowired
	@WebMethod(exclude=true)
	public void setHelloService(Hello helloService) {
		this.helloService = helloService;
	}
	
	@WebMethod
	@WebResult
	public String sayHello(String name) {
		return helloService.sayHello(name);
	}
}
