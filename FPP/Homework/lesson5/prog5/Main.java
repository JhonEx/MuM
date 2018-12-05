package lesson5.prog5;

//	Program 5

public class Main {

	public static void main(String[] args) {
		Computer c1 = new Computer("Apple", "Core i7", 32, 4.2);
		Computer c2 = new Computer("HP", "Core i7", 32, 4.2);
		Computer c3 = new Computer("Apple", "Core i7", 32, 4.2);

		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(Math.abs(c1.hashCode()));
		System.out.println(Math.abs(c3.hashCode()));
	}
}

//	result
//	false
//	true
//	1612126118
//	1612126118