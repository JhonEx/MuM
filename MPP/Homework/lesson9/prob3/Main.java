package lesson9.prob3;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Adam", "Jolie", "Ana", "Xerox");
		System.out.println("Count: " + countWords(list, 'o', 'y', 5));
	}

	public static int countWords(List<String> words, char c, char d, int len) {
		long count = words.stream()
				.filter(
						word -> word.length() == len &&
						word.contains(String.valueOf(c)) &&
						!word.contains(String.valueOf(d))
				).count();

		return (int) count;
	}

}
