package lesson4;

//	Program 1

public class Prog1 {

	public static void main(String[] args) {
		Prog1 m = new Prog1();
		System.out.println(m.merge("ace", "bdf"));
	}

	public String merge(String str1, String str2) {
		String str = str1 + str2;
		return sort(str, "", "", 0, 0);
	}

	private String sort(String str, String temp, String sorted, int indexNum, int sortedIndex) {
		if (str.length() <= 1)
			return sorted += str;
		
		if (temp.equals(""))
			temp = str.substring(0, 1);
		
		if (indexNum == str.length()) {
			indexNum = 0;
			sorted += temp;
			str = str.substring(0, sortedIndex) + str.substring(sortedIndex + 1);
			temp = str.substring(0, 1);
			sortedIndex = 0;
		} else {
			int comparer = temp.compareToIgnoreCase(str.substring(indexNum, indexNum + 1));
			if (comparer > 0) {
				temp = str.substring(indexNum, indexNum + 1);
				sortedIndex = indexNum;
			}
		}

		return sort(str, temp, sorted, ++indexNum, sortedIndex);
	}
}

//	result
//	abcdef