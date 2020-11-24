package exemple2;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person("Maurice", "Richard", "canadien");
		PersonDAO personDAO = new PersonDAO();
		personDAO.create(person);
		personDAO.read("A person...");
		person.setSurname("Rocket Richard");
		personDAO.update(person);
		personDAO.delete(person);
		
	}

}
