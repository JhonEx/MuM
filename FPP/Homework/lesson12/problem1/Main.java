package lesson12.problem1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = new String();
		System.out.println("Please input from 0 to 100:");

		while (true) {
			try {
				input = scan.nextLine();
				if (Integer.parseInt(input) < 0)
					throw new IllegalArgumentException();
				if (Integer.parseInt(input) > 100)
					throw new IllegalArgumentException();
				System.out.println("Your input is accepted.");
				scan.close();
				break;
			} catch (NumberFormatException e) {
				System.out.println("You should input a number. Please try again:");
			} catch (IllegalArgumentException e) {
				System.out.println("Your input is not correct. Please try again:");
			}
		}
	}
}
