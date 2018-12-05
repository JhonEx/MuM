package lesson5.prog6.exerciseB;

public class Person implements Cloneable {
	String name;
	Computer computer;

	public Person(String name, Computer computer) {
		this.name = name;
		this.computer = computer;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Person p = (Person) super.clone();
		p.computer = (Computer) this.computer.clone();
		return (Object) p;
	}
}
