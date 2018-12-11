package lesson8.day1.problem2;

import java.util.Objects;

public class Person {
	private String lastName;
	private String firstName;
	private int age;
	
	@Override
	public int hashCode() {
		return Objects.hash(lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Person person = (Person) obj;
		if (!lastName.equals(person.lastName)) return false;
		return true;
	}

	public Person(String lastName, String firstName, int age) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	@Override
	public String toString() {
		return "Person [lastName=" + lastName + " FirstName=" + firstName + " Age=" + age + "]";
	}
	
	public static void main(String[] args) {
		PersonList peopleList = new PersonList();
		peopleList.add(new Person("Gate", "Bill", 58));
		peopleList.add(new Person("Job", "Steve", 60));
		peopleList.add(new Person("Ellison", "Larry", 60));
		peopleList.add(new Person("Zuckerberg", "Mark", 35));
		
		System.out.println("The list of size: " + peopleList.size() + " is \n" + peopleList + "\n");
		
		Person steveJob = peopleList.get(1);
		peopleList.remove(steveJob);
		
		System.out.println("The list of size: " + peopleList.size() + " is \n" + peopleList + "\n");
		
		peopleList.insert(new Person("Elon", "Musk", 45), 0);
		System.out.println("The list of size: " + peopleList.size() + " is \n" + peopleList + "\n");
		
		peopleList.insert(new Person("Larry", "Page", 44), 4);
		System.out.println("The list of size: " + peopleList.size() + " is \n" + peopleList + "\n");
		
	}
}

//	result
//	The list of size: 4 is 
//	[Person [lastName=Gate FirstName=Bill Age=58], 
//	Person [lastName=Job FirstName=Steve Age=60], 
//	Person [lastName=Ellison FirstName=Larry Age=60], 
//	Person [lastName=Zuckerberg FirstName=Mark Age=35]]
//	
//	The list of size: 3 is 
//	[Person [lastName=Gate FirstName=Bill Age=58], 
//	Person [lastName=Ellison FirstName=Larry Age=60], 
//	Person [lastName=Zuckerberg FirstName=Mark Age=35]]
//	
//	The list of size: 4 is 
//	[Person [lastName=Elon FirstName=Musk Age=45], 
//	Person [lastName=Gate FirstName=Bill Age=58], 
//	Person [lastName=Ellison FirstName=Larry Age=60], 
//	Person [lastName=Zuckerberg FirstName=Mark Age=35]]
//	
//	The list of size: 5 is 
//	[Person [lastName=Elon FirstName=Musk Age=45], 
//	Person [lastName=Gate FirstName=Bill Age=58], 
//	Person [lastName=Ellison FirstName=Larry Age=60], 
//	Person [lastName=Zuckerberg FirstName=Mark Age=35], 
//	Person [lastName=Larry FirstName=Page Age=44]]
