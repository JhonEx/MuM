package prog4;

import java.util.Scanner;

// Program 4

public class Prog4 {

	public static void main(String[] args) {
		System.out.println("Enter C for Circle");
		System.out.println("Enter R for Rectangle");
		System.out.println("Enter T for Triangle");
		Scanner scanner = new Scanner(System.in);
		
		while(true) {		
			String input = scanner.nextLine();
			switch (input) {
			case "C":
				computeCircle(scanner);
				return;
			case "R":
				computeRectangle(scanner);
				return;
			case "T":
				computeTrangle(scanner);
				return;
			default:
				System.out.println("You should enter C, R or T.");
				break;
			}
		}
	}
	
	private static void computeCircle(Scanner scanner) {
		System.out.println("Enter radius of the Circle: ");
		int radius = scanner.nextInt();
		System.out.println("The area of Circle is: " + new Circle(radius).computeArea());
		scanner.close();
	}
	
	private static void computeRectangle(Scanner scanner) {
		System.out.println("Enter width of the Rectangle: ");
		int width = scanner.nextInt();
		System.out.println("Enter height of the Rectangle: ");
		int height = scanner.nextInt();
		System.out.println("The area of Rectangle is: " + new Rectangle(width, height).computeArea());
		scanner.close();
	}
	
	private static void computeTrangle(Scanner scanner) {
		System.out.println("Enter base of the Triangle: ");
		int base = scanner.nextInt();
		System.out.println("Enter height of the Triangle: ");
		int height = scanner.nextInt();
		System.out.println("The area of Triangle is: " + new Triangle(base, height).computeArea());
		scanner.close();
	}
}


//  result
//	Enter C for Circle
//	Enter R for Rectangle
//	Enter T for Triangle
//	R
//	Enter width of the Rectangle: 
//	120
//	Enter height of the Rectangle: 
//	200
//	The area of Rectangle is: 24000.0
