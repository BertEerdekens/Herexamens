package pxl.hoofdstuk2WebService.personApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

@Repository
public class PersonsDaoMemImpl implements PersonsDao{
	private Map<Integer, Person> persons;
	
	@PostConstruct
	public void init() {
		persons = new HashMap<Integer, Person>();
		persons.put(1,  new Person(1, "Homer","Simpson", "555-678-897"));
		persons.put(2,  new Person(1, "Bart","Simpson", "555-112-345"));

	}
	
	public Person getPersonById(int id) {
		return persons.get(id);
	}

	public List<Person> getPersonsByName(String name) {
		List<Person> result = new ArrayList<Person>();
		for(Person p: persons.values()) {
			if(p.getLastName().equals(name)) {
				result.add(p);
			}
		}
		return result;
	}

	public void updatePerson(int id, Person p) {
		persons.put(p.getId(), p);
		
	}

	public void deletePerson(int id) {
		persons.remove(id);		
	}

}
