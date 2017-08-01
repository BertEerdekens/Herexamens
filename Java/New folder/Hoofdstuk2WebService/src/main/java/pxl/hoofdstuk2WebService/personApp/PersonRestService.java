package pxl.hoofdstuk2WebService.personApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons")
public class PersonRestService {
	
	@Autowired
	private PersonsDao dao;
	
	@RequestMapping(method = RequestMethod.GET)
	public Person getPersonsById() {
		return dao.getPersonById(1);
	}
}
