package lesson9.problem2;

public class Main {
	public static void main(String[] args) {
		LinkedListStack stk = new LinkedListStack(4);
		Object item;
		stk.push('A');
		stk.push('B');
		stk.push('C');
		stk.push('D');
		
		System.out.println("size(): "+ stk.size());
		item = stk.pop();
		System.out.println(item + " is deleted");
		stk.push('D');
		stk.push('E');
		System.out.println(stk.pop() + " is deleted");
		stk.push('G');
		item = stk.peek();
		System.out.println(item + " is on top of stack");
		System.out.println("Size of the Stack : " + stk.size());
	}
}


//	result
//	size(): 4
//	D is deleted
//	Stack is full
//	D is deleted
//	G is on top of stack
//	Size of the Stack : 4