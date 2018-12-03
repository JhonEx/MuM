package lesson4;

//	Program 2

public class Prog2 {

	public static void main(String[] args) {
		Prog2 min = new Prog2();
		System.out.println(min.minimumCharacter("akel", "", 1));
	}

	public String minimumCharacter(String str, String temp, int indexNum) {
		if (temp.equals(""))
			temp = str.substring(0, 1);

		if (indexNum == str.length())
			return temp;

		int comparer = temp.compareToIgnoreCase(str.substring(indexNum, indexNum + 1));
		if (comparer > 0)
			temp = str.substring(indexNum, indexNum + 1);

		return minimumCharacter(str, temp, ++indexNum);
	}

}

//	result
//	a