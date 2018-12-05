package lesson5.prog6.exerciseA;

public class Person implements Cloneable {
	String name;
	Computer computer;

	public Person(String name, Computer computer) {
		this.name = name;
		this.computer = computer;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return (Object) super.clone();
	}
}
