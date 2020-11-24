package exemple2;

public class Person {
	private String name;
	private String surname;
	private String nationality;
	
	//constructor:
	public Person(String name, String surname, String nationality) {
		super();
		this.name = name;
		this.surname = surname;
		this.nationality = nationality;
	}
	
	//Getters and setters:
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", nationality=" + nationality + "]";
	}
}
