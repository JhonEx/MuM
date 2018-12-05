package lesson5.prog6.exerciseB;

//	Program 6 - Deep copy

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Computer computer = new Computer("Apple", "Core i7", 32, 4.2);
		Person john = new Person("Kyle", computer);
		Person david = (Person) john.clone();
		
		System.out.println(john.equals(david));
		john.computer.manufacturer = "HP";
		
		System.out.println("John computer manufacturer is: " + john.computer.manufacturer);
		System.out.println("David computer manufacturer is: " + david.computer.manufacturer);
	}
}

//	result
//	false
//	John computer manufacturer is: HP
//	David computer manufacturer is: Apple
