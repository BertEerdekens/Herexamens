package pxl.hoofdstuk2WebService.personApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons")
public class PersonRestController {

	@Autowired
	private PersonsDao dao;
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET, produces = {"application/xml", "application/json"})
	public ResponseEntity<Person> getPersonsById(@PathVariable("id") int id) {
		System.out.println("GET " + id);
		HttpStatus status = HttpStatus.OK;
		Person person = dao.getPersonById(id);
		if(person == null) {
			status = HttpStatus.NOT_FOUND;			
		}
		return new ResponseEntity<Person>(person, status);
	}
}
