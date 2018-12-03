package lesson4;

//	Program 4

public class Prog4 {

	public static void main(String[] args) {
		Prog4 p = new Prog4();
		System.out.println(p.isPalindrome("madam", "", 0));
	}

	public boolean isPalindrome(String str, String temp, int indexNum) {
		if (temp.equals("")) {
			indexNum = str.length();
			temp = str.substring(indexNum - 1, indexNum);
		} else {
			temp += str.substring(indexNum - 1, indexNum);
		}

		if (indexNum == 1 && str.equals(temp))
			return true;
		if (indexNum == 1)
			return false;

		return isPalindrome(str, temp, --indexNum);
	}

}

//	result
//	true