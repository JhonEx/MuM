package lesson8.day1.problem2;

public class PersonList {
	private final int INITIAL_LENGTH = 4;
	private Person[] people;
	private int size;
	
	public PersonList() {
		people = new Person[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(Person person) {
		if (size == people.length) resize();
		people[size++] = person;
	}
	
	private void resize() {
		int peopleLength = people.length;
		int doubleSize = peopleLength * 2;
		Person[] tempPeople = new Person[doubleSize];
		System.arraycopy(people, 0, tempPeople, 0, peopleLength);
		people = tempPeople;
	}
	
	public Person get(int index) {
		if (index < 0 || index >= size) return null;
		return people[index];
	}
	
	public boolean find(String lastName) {
		Person personLastName = new Person(lastName, "", 0);
		for (Person person: people) {
			if (person.equals(personLastName)) return true;
		}
		return false;
	}
	
	public void insert(Person person, int position) {
		if (position > size) return;
		if (position >= people.length || size + 1 > people.length) resize();
		Person[] tempPeople = new Person[people.length + 1];
		System.arraycopy(people, 0, tempPeople, 0, position);
		tempPeople[position] = person;
		System.arraycopy(people, position, tempPeople, position + 1, people.length - position);
		people = tempPeople;
		++size;
	}
	
	
	public boolean remove(Person person) {
		if (size == 0) return false;
		int index = -1;
		for (int i = 0; i < size; ++i) {
			if (people[i].equals(person)) {
				index = i;
				break;
			}
		}
		
		if (index == -1) return false;
		Person[] tempPeople = new Person[people.length];
		System.arraycopy(people, 0, tempPeople, 0, index);
		System.arraycopy(people, index + 1, tempPeople, index, people.length - (index + 1));
		people = tempPeople;
		--size;
		return true;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder("[");
		for (int i = 0; i < size - 1; ++i) {
			builder.append(people[i] + ", \n");
		}
		builder.append(people[size - 1] + "]");
		return builder.toString();
	}
	
	public int size() { return size; }
}
