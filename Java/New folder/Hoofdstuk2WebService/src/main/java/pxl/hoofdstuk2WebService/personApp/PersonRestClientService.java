package pxl.hoofdstuk2WebService.personApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
/*
@Component("PersonService")
public class PersonRestClientService {
	private String baseURL;
	
	private RestTemplate template;
	
	@Value("http://localhost:8080/")
	public void setBaseUrl(String base) {
		this.baseURL = base;
	}
	
	@Autowired
	public void setTemplate(RestTemplate template) {
		this.template = template;
	}
	
	public Person getPersonById(int id) {
		return template.getForObject(baseURL + "persons/{0}", Person.class, id);
	}
}*/
