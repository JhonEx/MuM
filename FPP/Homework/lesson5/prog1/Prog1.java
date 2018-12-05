package lesson5.prog1;

//	Program 1

public class Prog1 {

	public static void main(String[] args) {
		Shape shapes[] =  {
				new Rectangle("red", 25, 30),
				new Rectangle("blue", 20, 50),
				new Circle("brown", 5),
				new Circle("green", 7),
				new Sequare("yellow", 12)
		};
		
		double totalArea = 0;
		double totalPerimeter = 0;
		
		for(Shape shape: shapes) {
			totalArea += shape.calculateArea();
			totalPerimeter += shape.calculatePerimeter();
		}
		
		System.out.println("Total area: " + totalArea);
		System.out.println("Total Perimeter: " + totalPerimeter);
	}
}

//	result
//	Total area: 2126.4778563656446
//	Total Perimeter: 373.39822368615506