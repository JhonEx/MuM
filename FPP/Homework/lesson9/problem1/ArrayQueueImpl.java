package lesson9.problem1;

public class ArrayQueueImpl {
	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;

	public int peek() {
		if (isEmpty())
			return -1;
		return arr[front];
	}

	public void enqueue(int obj) {
		if (arr.length == rear) {
			resize();
		}
		if (isEmpty()) {
            front++;
        }
		arr[rear] = obj;
		rear++;
	}

	public int dequeue() {
		if (size() == 0) {
			front = -1;
			rear = 0;
			return -1;
		}
		return arr[front++];
	}

	public boolean isEmpty() {
		return front == -1;
	}

	public int size() {
		return isEmpty() ? 0 : rear - front;
	}

	private void resize() {
		int[] temp = new int[arr.length * 2];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr = temp;
	}
}

