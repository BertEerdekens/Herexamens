package pxl.hoofdstuk2WebService.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String handleGet() {
		System.out.println("GET");
		return "hello World";
	}
}
