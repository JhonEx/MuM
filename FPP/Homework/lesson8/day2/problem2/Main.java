package lesson8.day2.problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		ArrayList<Marketing> list = new ArrayList<>();
		list.add(new Marketing("Jone Shawn", "Pixel 3 XL", 1200));
		list.add(new Marketing("Andrew Cou", "Note X", 900));
		list.add(new Marketing("Alice", "iPhone L", 1500));
		list.add(new Marketing("Alice", "iPhone L", 1500));
		
		list.remove(3);
		System.out.println("Original Array: ");
		list.forEach(System.out::println);
		
		System.out.println("\nSorted by Sales Amount: ");
		Collections.sort(list, new SalesAmountComparator());
		list.forEach(System.out::println);
		
		System.out.println("\nSorted by Employee Name: ");
		Collections.sort(list, new EmployeeNameComparator());
		list.forEach(System.out::println);
		
		System.out.println("\nMore than 1000 (Sales Amount): ");
		List<Marketing> listFilters = listMoreThan1000(list);
		listFilters.forEach(System.out::println);
	}

	public static List<Marketing> listMoreThan1000(List<Marketing> list) {
		List<Marketing> markets = new ArrayList<Marketing>();
		list.forEach(market -> {
			if (market.getSalesAmount() > 1_000) {
				markets.add(market);
			}
		});
		Collections.sort(markets, new EmployeeNameComparator());
		return markets;
	}
}

//	result
//	Original Array: 
//	[Jone Shawn, Pixel 3 XL, 1200.0]
//	[Andrew Cou, Note X, 900.0]
//	[Alice, iPhone L, 1500.0]
//	
//	Sorted by Sales Amount: 
//	[Andrew Cou, Note X, 900.0]
//	[Jone Shawn, Pixel 3 XL, 1200.0]
//	[Alice, iPhone L, 1500.0]
//	
//	Sorted by Employee Name: 
//	[Alice, iPhone L, 1500.0]
//	[Andrew Cou, Note X, 900.0]
//	[Jone Shawn, Pixel 3 XL, 1200.0]
//	
//	More than 1000 (Sales Amount): 
//	[Alice, iPhone L, 1500.0]
//	[Jone Shawn, Pixel 3 XL, 1200.0]
