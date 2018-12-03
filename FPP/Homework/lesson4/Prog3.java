package lesson4;

//	Program 3

public class Prog3 {

	public static void main(String[] args) {
		int list[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Prog3 b = new Prog3();
		System.out.println(b.binarySearch(list, -1, 10));
	}
	
	public int binarySearch(int[] list, int mid, int element) {
		if (mid < 0) 
			mid = list.length / 2;
		
		if (list[mid] == element) {
			return mid;
		}
		
		if (list[mid] > element) {
			mid--;
		} else {
			mid++;
		}
		
		if (mid == -1 || mid == list.length)
			return -1;
		
		return binarySearch(list, mid, element);
	}
}

//	result
//	9