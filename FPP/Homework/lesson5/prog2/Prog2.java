package lesson5.prog2;

import java.time.LocalDate;
import java.util.Scanner;

//	Program 2

public class Prog2 {

	public static void main(String[] args) {
		DeptEmployee emps[] = {
				new Professor("Renuka", 12000, LocalDate.of(2008, 10, 1)),
				new Professor("Joe", 12000, LocalDate.of(2005, 11, 1)),
				new Professor("Corazza", 12000, LocalDate.of(2007, 11, 5)),
				new Secretary("Jol", 8000, LocalDate.of(20010, 9, 15)),
				new Secretary("Liz", 8000, LocalDate.of(20011, 9, 12)),
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to see all department employee salary? (y/n)");
		String answer = sc.nextLine();
		double totalSalary = 0.0;
		
		if (answer.equalsIgnoreCase("y")) {
			for (DeptEmployee emp: emps) {
				totalSalary += emp.computeSalary();
			}
			System.out.println("Total employees salary is: " + totalSalary);
		}
		
		sc.close();
	}

}

//	result
//	Do you want to see all department employee salary? (y/n)
//	y
//	Total employees salary is: 52000.0