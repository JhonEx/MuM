package lesson8.day1.problem1;

public class Main {

	public static void main(String[] args) {
		MyStringList stringList = new MyStringList();
		
		String[] lists = { "big", "small", "tall", "short", "round", "square", "enormous", "tiny", "gargantuan",
				"lilliputian", "numberless", "none", "vast", "miniscule" };
		
		for(String list: lists) {
			stringList.add(list);
		}
		
		System.out.println("Data before sort: " + stringList);
		
		stringList.sort();
		System.out.println("Data after sort: " + stringList);
		
		System.out.println("Searching for 'number': " + stringList.search("number"));
		System.out.println("Searching for 'tiny': " + stringList.search("tiny"));
	}

}

//	result
//	Data before sort: [big, small, tall, short, round, square, enormous, tiny, gargantuan, lilliputian, numberless, none, vast, miniscule]
//	Data after sort: [big, enormous, gargantuan, lilliputian, miniscule, none, numberless, round, short, small, square, tall, tiny, vast]
//	Searching for 'number': false
//	Searching for 'tiny': true