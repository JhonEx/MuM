// Program 1

public class Prog1 {

	public static void main(String[] args) {
		final double PI = Math.PI;

		int x = RandomNumbers.getRandomInt(1, 9);
		int y = RandomNumbers.getRandomInt(3, 14);

		System.out.println(Math.pow(PI, x));
		System.out.println(Math.pow(PI, y));
	}

}

// result
// 31.006276680299816
// 961.3891935753043


// Program 2

public class Prog2 {

	public static void main(String[] args) {
		float a = (float) 1.27;
		float b = (float) 3.881;
		float c = (float) 9.6;

		int sumAsInt = (int) (a + b + c);
		int rounded = Math.round(a + b + c);

		System.out.println("Sum as Int: " + sumAsInt);
		System.out.println("Rounding: " + rounded);
	}

}

// result
// Sum as Int: 14
// Rounding: 15


// Program 3

public class Prog3 {

	public static void main(String[] args) {
		// column names: productId, name, numInStock, provider, pricePerUnit
		 String records = "231A,Light Bulb,123,Wilco,1.75:" +
										  "113D,Hairbrush,19,Aamco,3.75:" +
										  "521W,Shampoo,24,Acme,6.95:" +
										  "440Q,Dishwashing Detergent,20,Wilco,1.75:" +
										  "009G,Toothbrush,77,Wilco,0.85:" +
										  "336C,Comb,34,Wilco,0.99:" +
										  "523E,Paper Pad Set,109,Congdon and Chrome,2.45:" +
										  "888A,Fake Diamond Ring,111,AmericusDiamond,3.95:" +
										  "176A,Romance Nove1 1,20,Barnes and Noble,3.50:" +
										  "176B,Romance Nove1 2,20,Barnes and Noble,3.50:" +
										  "176C,Romance Nove1 3,20,Barnes and Noble,3.50:" +
										  "500D,Floss,44,Wilco,1.25:" +
										  "135B,Ant Farm,5,Wilco,8.00:" +
										  "211Q,Bicycle,9,Schwinn,75.95:" +
										  "932V,Pen Set,50,Congdon and Chrome,9.95:" +
										  "678Q,Pencil 50,123,Congdon and Chrome,9.95:" +
										  "239A,Colored Pencils,25,Congdon and Chrome,4.75:" +
										  "975B,Shower Curtain,25,Wilco,6.50:" +
										  "870K,Dog Bowl,15,Wilco,4.75:" +
										  "231S,Cat Bowl,15,Wilco,4.75:" +
										  "562M,Kitty Litter,15,Wilco,3.25:" +
										  "777X,Dog Bone,15,Wilco,4.15:" +
										  "933W,Cat Toy,15,Wilco,2.35:" +
										  "215A,Hair Ball,0,Little Jimmy,0.00:";

		 String allRecords[] = records.split(":");

		 for(String record: allRecords) {
			 System.out.println(record.split(",")[0]);
		 }
	}
}

// result
// 231A
// 113D
// 521W
// 440Q
// 009G
// 336C
// 523E
// 888A
// 176A
// 176B
// 176C
// 500D
// 135B
// 211Q
// 932V
// 678Q
// 239A
// 975B
// 870K
// 231S
// 562M
// 777X
// 933W
// 215A


// Program 4

public class Prog4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please input a text: ");
		String input = scanner.nextLine();

		for(int i = input.length() - 1; i >= 0; i--) {
			System.out.print(input.charAt(i));
		}
	}
}

// result
// Please input a text: Hello
// olleH


// Program 5

public class Prog5 {

	public static void main(String[] args) {
		int rn[] = new int[4];
		int formated[][] = new int[4][4];

		for (int i = 0; i < formated.length; i++) {
			for (int n = 0; n < rn.length; n++) {
				formated[i][n] = RandomNumbers.getRandomInt(1, 99);
			}
		}

		for (int i = 0; i < formated.length; i++) {
			for (int n = 0; n < rn.length; n++) {
				if (i == 0 || i == 2) {
					System.out.print("   " + formated[i][n] + "\t");
				} else {
					System.out.print(" + " + formated[i][n] + "\t");
				}
			}

			System.out.println("\n");

			if (i == 1 || i == 3) {
				for (int n = 0; n < rn.length; n++) {
					System.out.print(" ____" + "\t");
				}
				System.out.println("\n\n\n\n");
			}
		}
	}
}

// result
//   17	    75	    89	    71
//
// + 13	  + 96	   + 2	  + 31
//
// ____	  ____	  ____	  ____
//
//
//
//
//   52	    86	    34	    93
//
// + 52	  + 55	  + 50	  + 60
//
// ____	  ____	  ____	  ____


// Program 6

public class Prog6 {

	public static void main(String[] args) {
		String dups[] = {"horse", "dog", "cat", "horse", "dog"};

		StringBuilder sb = new StringBuilder();
		sb.append(dups[0]);

		for (int i = 1; i < dups.length; i++) {
			if (!isExisted(dups[i], sb.toString().split(":"))) {
				sb.append(":");
				sb.append(dups[i]);
			}
		}

		String[] out = sb.toString().split(":");
		System.out.println(Arrays.toString(out));
	}

	static boolean isExisted(String element, String[] existedElements) {
		boolean result = false;
		for (int i = 0; i < existedElements.length; i++) {
			if (existedElements[i].equals(element)) {
				return true;
			}
		}
		return result;
	}
}

// result
// [horse, dog, cat]


// Program 7

public class Prog7 {

	public static void main(String[] args) {
		if (args != null) {
			int countStartWithA = 0;
			for (int i = 0; i < args.length; i++) {
				System.out.println("length of string: " + args[i].length());
			}

			for (int i = 0; i < args.length; i++) {
				if (args[i].startsWith("A")) {
					countStartWithA++;
				}
			}

			System.out.println("count start with A: " + countStartWithA);
		}
	}

}

// Program Arguments: Hello World Apple

// result
// length of string: 5
// length of string: 5
// length of string: 5
// count start with A: 1


// Program 8

public class prog8 {

	public static void main(String[] args) {
		int input[] = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};
		int lowest = input[0];

		for (int i = 1; i < input.length; i++) {
			if (lowest > input[i]) {
				lowest = input[i];
			}
		}

		System.out.println("lowest number: " + lowest);
	}
}

// result
// lowest number: -21
