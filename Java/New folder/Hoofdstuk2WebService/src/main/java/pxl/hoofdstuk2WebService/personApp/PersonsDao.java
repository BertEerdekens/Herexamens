package pxl.hoofdstuk2WebService.personApp;

import java.util.List;

public interface PersonsDao {
	public Person getPersonById(int id);
	public List<Person> getPersonsByName(String name);
	public void updatePerson(int id, Person p);
	public void deletePerson(int id);
}
