package lesson9.problem1;

public class Main {
	public static void main(String[] args) {
		ArrayQueueImpl q = new ArrayQueueImpl();
		
		System.out.println("peek(): " + q.peek());
		
		for(int i = 1; i <= 15; i++) {
			q.enqueue(i);
		}
		
		System.out.println("Dequeue(): " + q.dequeue());
		System.out.println("peek(): " + q.peek());
		System.out.println("Dequeue(): " + q.dequeue());
		System.out.println("peek(): " + q.peek());
		System.out.println("size(): " + q.size());
		System.out.println("isEmpty(): " + q.isEmpty());
		
		ArrayQueueImpl q1 = new ArrayQueueImpl();
		System.out.println("isEmpty(): " + q1.isEmpty());
	}
}


//	result
//	peek(): -1
//	Dequeue(): 1
//	peek(): 2
//	Dequeue(): 2
//	peek(): 3
//	size(): 13
//	isEmpty(): false
//	isEmpty(): true
