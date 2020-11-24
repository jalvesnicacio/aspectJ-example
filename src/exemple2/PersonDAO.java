package exemple2;

public class PersonDAO {
	
	public Person create(Person person) {
		System.out.println("Saving "+ person + " in the database");
		return person;
	}
	
	public void read(String name) {
		System.out.println("Search '" + name + "' from database");
	}
	
	public Person update(Person person) {
		System.out.println("Updating " + person + " in the database");
		return person;
	}
	
	public Person delete(Person person) {
		System.out.println("Destroying database person record");
		return person;
	}

}
