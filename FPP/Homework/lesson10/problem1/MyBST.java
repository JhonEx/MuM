package lesson10.problem1;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class MyBST {
	/** The tree root. */
	private BinaryNode root;

	public MyBST() {
		root = null;
	}

	public void preOrder() {
		preOrder(root);
	}

	private void preOrder(BinaryNode t) {
		if (t != null)
			printTreePreOrder(t);
	}

	private void printTreePreOrder(BinaryNode t) {
		if (t != null) {
			System.out.print(t.element + ",");
			preOrder(t.left);
			preOrder(t.right);
		}
	}

	public void postOrder() {
		postOrder(root);
	}

	private void postOrder(BinaryNode t) {
		if (t != null)
			printTreePostOrder(t);
	}

	private void printTreePostOrder(BinaryNode t) {
		if (t != null) {
			postOrder(t.left);
			postOrder(t.right);
			System.out.print(t.element + ",");
		}
	}

	/**
	 * Prints the values in the nodes of the tree in sorted order. In order Traversal
	 */
	public void printTree() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printTree(root);
	}

	// In order Traversal to print the nodes in Ascending order
	private void printTree(BinaryNode t) {
		if (t != null) {
			printTree(t.left);
			System.out.print(t.element + ",");
			printTree(t.right);
		}
	}

	public boolean contains(Integer key) {
		if (root == null) {
			return false;
		}
		return contains(root, key);
	}

	private boolean contains(BinaryNode t, Integer key) {
		if (t.element == key)
			return true;
		boolean isFound = false;
		if (t.left != null)
			isFound = contains(t.left, key);
		if (!isFound && t.right != null)
			isFound = contains(t.right, key);
		return isFound;
	}

	public Integer getRoot() {
		return root != null ? -1 : root.element;
	}

	public Integer leafNodes() {
		return leafNodes(root);
	}

	private int leafNodes(BinaryNode t) {
		if (t == null)
			return 0;

		if (t.left == null && t.right == null)
			return 1;
		else
			return leafNodes(t.left) + leafNodes(t.right);
	}

	public int size() {
		return size(root);
	}

	private int size(BinaryNode t) {
		if (t == null) {
			return 0;
		}

		return size(t.left) + size(t.right) + 1;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public Integer findMin() {
		return findMin(root);
	}

	private Integer findMin(BinaryNode t) {
		if (t == null) {
			return -1;
		}
		BinaryNode binaryNode = t;
		while (binaryNode.left != null) {
			binaryNode = binaryNode.left;
		}
		return binaryNode.element;
	}
	
	public Integer findMax() {
		return findMax(root);
	}

	private Integer findMax(BinaryNode t) {
		if (t == null) {
			return -1;
		}
		BinaryNode binaryNode = t;
		while (binaryNode.right != null) {
			binaryNode = binaryNode.right;
		}
		return binaryNode.element;
	}
	
	
	// Assume the data in the Node is an Integer.

	public void insert(Integer x) {
		if (root == null) {
			root = new BinaryNode(x);
			return;
		} else {
			BinaryNode n = root;
			boolean inserted = false;

			while (!inserted)// true
			{
				if (x.compareTo(n.element) < 0) {
					// space found on the left
					if (n.left == null) {
						n.left = new BinaryNode(x, null, null);
						inserted = true;
					}
					// keep looking for a place to insert (a null)
					else {
						n = n.left;
					}
				} else if (x.compareTo(n.element) > 0) {
					// space found on the right
					if (n.right == null) {
						n.right = new BinaryNode(x, null, null);
						inserted = true;
					}
					// keep looking for a place to insert (a null)
					else {
						n = n.right;
					}

				}
				// if a node already exists
				else {
					inserted = true;
				}

			}

		}
	}

	private class BinaryNode {

		private Integer element;// The data in the node
		private BinaryNode left; // Left child
		private BinaryNode right; // Right child
		// Constructors

		BinaryNode(Integer theElement) {
			this(theElement, null, null);
		}

		BinaryNode(Integer element, BinaryNode left, BinaryNode right) {
			this.element = element;
			this.left = left;
			this.right = right;
		}

	}

	public static void main(String[] args) {

		MyBST mybst = new MyBST();

		int[] a = { 15, 12, 9, 56, 1, 16, 19, 22, 3, 100, 2, 25 };

		for (int j = 0; j < a.length; j++) {
			mybst.insert(a[j]);
		}
		mybst.insert(12);
		System.out.println("In Order:");
		mybst.printTree();
		System.out.println("\nPre Order:");
		mybst.preOrder();
		System.out.println("\nPost Order:");
		mybst.postOrder();

		System.out.println("\nContains 6: " + mybst.contains(6));
		System.out.println("Number of Leaf Nodes: " + mybst.leafNodes());

		System.out.println("Size: " + mybst.size());

		System.out.println("isEmpty: " + mybst.isEmpty());
		System.out.println("FindMin: " + mybst.findMin());
		System.out.println("FindMax: " + mybst.findMax());

		TreeSet<Integer> ts = new TreeSet<Integer>();

		for (int j = 0; j < a.length; j++) {
			ts.add(a[j]);
			System.out.println("\nAfter inserting " + j + "th item " + a[j]);
			Iterator<Integer> it = ts.iterator();
			Integer nextItem = null;
			while (it.hasNext()) {
				nextItem = it.next();
				System.out.print(nextItem + " ");
			}
			System.out.println();
		}

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(8, "Hello");
		map.put(10, "World!");
		map.put(11, "Welcome");
		map.remove(8);
		String str = map.get(11) + ", " + map.get(10);
		System.out.println(str);

	}
}


//	result

//	In Order:
//	1,2,3,9,12,15,16,19,22,25,56,100,
//	Pre Order:
//	15,12,9,1,3,2,56,16,19,22,25,100,
//	Post Order:
//	2,3,1,9,12,25,22,19,16,100,56,15,
//	Contains 6: false
//	Number of Leaf Nodes: 3
//	Size: 12
//	isEmpty: false
//	FindMin: 1
//	FindMax: 100
//	
//	After inserting 0th item 15
//	15 
//	
//	After inserting 1th item 12
//	12 15 
//	
//	After inserting 2th item 9
//	9 12 15 
//	
//	After inserting 3th item 56
//	9 12 15 56 
//	
//	After inserting 4th item 1
//	1 9 12 15 56 
//	
//	After inserting 5th item 16
//	1 9 12 15 16 56 
//	
//	After inserting 6th item 19
//	1 9 12 15 16 19 56 
//	
//	After inserting 7th item 22
//	1 9 12 15 16 19 22 56 
//	
//	After inserting 8th item 3
//	1 3 9 12 15 16 19 22 56 
//	
//	After inserting 9th item 100
//	1 3 9 12 15 16 19 22 56 100 
//	
//	After inserting 10th item 2
//	1 2 3 9 12 15 16 19 22 56 100 
//	
//	After inserting 11th item 25
//	1 2 3 9 12 15 16 19 22 25 56 100 
//	Welcome, World!
