package pxl.hoofdstuk2WebService.personApp;


public class Person {

	private int id;
	private String firstName;
	private String lastName;
	private String phone;
	
	public Person() {
		
	}
	
	public Person(int id, String firstName, String lastName, String phone) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return String.format("Person [id=%s, firstName=$s, lastName=%s, phone=%s]", id, firstName, lastName, phone);
	}
}
