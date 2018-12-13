package lesson8.day2.problem1;

public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = null;
	}

	public void addSort(String item) {
		if (isFirstNode(item))
			return;
		addNewNode(item);
	}

	private boolean isFirstNode(String item) {
		if (header == null) {
			header = new Node(null, item, null);
			return true;
		}
		return false;
	}

	private void addNewNode(String item) {
		Node temp = header;
		while (temp != null) {
			if (equalLevel(temp, item))
				break;
			if (higherLevel(temp, item))
				break;
			if (lowerLevel(temp, item))
				break;
			temp = temp.next;
		}
	}

	private boolean equalLevel(Node node, String item) {
		return node.value.compareTo(item) == 0 ? addAfter(node, item) : higherLevel(node, item);
	}

	private boolean higherLevel(Node node, String item) {
		return node.value.compareTo(item) < 0 ? nodeNext(node, item) : addBefore(node, item);
	}

	private boolean nodeNext(Node node, String item) {
		return node.next != null ? nodeNextLevel(node, item) : addAfter(node, item);
	}

	private boolean nodeNextLevel(Node node, String item) {
		if (node.next.value.compareTo(item) < 0)
			return false;
		else
			return addAfter(node, item);
	}

	private boolean lowerLevel(Node node, String item) {
		return node.value.compareTo(item) > 0 ? addBefore(node, item) : false;
	}

	private boolean addBefore(Node node, String item) {
		Node newNode = new Node(node.previous, item, node);
		if (node.previous != null) {
			node.previous.next = newNode;
		} else {
			header = newNode;
		}
		node.previous = newNode;
		return true;
	}

	private boolean addAfter(Node node, String item) {
		Node newNode = new Node(node, item, node.next);
		if (node.next != null) {
			node.next.previous = newNode;
		}
		node.next = newNode;
		return true;
	}

	public int size() {
		int count = 0;
		Node temp = header;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public boolean isEmpty() {
		if (header == null)
			return true;
		else
			return false;
	}

	public Node getFirst() {
		return header;
	}

	public Node getLast() {
		Node temp = header;
		Node lastNode = header;
		while (temp != null) {
			lastNode = temp;
			temp = temp.next;
		}
		return lastNode;
	}

	public boolean contains(String item) {
		Node temp = header;
		while (temp != null) {
			if (temp.value.equals(item)) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public void removeFirst() {
		Node temp = header.next;
		if (header != null) {
			if (header.next != null) { 
				header = null;
				header = temp;
				header.previous = null;
			} else {
				header = null;
			}
		}
	}

	void removeLast() {
		Node lastNode = getLast();
		Node temp = lastNode.previous;
		if (lastNode != null) {
			lastNode = null;
			lastNode = temp;
			lastNode.next = null;
		}
	}

	public void print() {
		print(header);
	}

	void print(Node n) {
		if (n == null)
			return;
		System.out.print(n + " ");
		print(n.next);
	}

	public String toString() {
		String str = "";
		Node temp = header;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}

	public class Node {
		String value;
		Node next;
		Node previous;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		public String toString() {
			return value;
		}
	}

	public static void main(String[] args) {
		MyStringLinkedList mySL = new MyStringLinkedList();
		mySL.addSort("Z");
		mySL.addSort("A");
		mySL.addSort("D");
		mySL.addSort("D");
		mySL.addSort("X");
		mySL.addSort("A");
		mySL.addSort("B");
		mySL.addSort("C");
		mySL.print();
		
		System.out.println();
		System.out.println("\nGet first: " + mySL.getFirst());
		System.out.println("Get last: " + mySL.getLast());
		
		System.out.println("Size: " + mySL.size());
		System.out.println("Contain 'B': " + mySL.contains("B"));
		System.out.println("Contain 'Y': " + mySL.contains("Y"));
		System.out.println("Remove first");
		mySL.removeFirst();
		mySL.print();
		System.out.println("\nRemove last");
		mySL.removeLast();
		mySL.print();
		
		System.out.println("\n" + mySL);
	}
}


//	result
//	A A B C D D X Z 
//	
//	Get first: A
//	Get last: Z
//	Size: 8
//	Contain 'B': true
//	Contain 'Y': false
//	Remove first
//	A B C D D X Z 
//	Remove last
//	A B C D D X 
//	-->[A]-->[B]-->[C]-->[D]-->[D]-->[X]-->[NULL]