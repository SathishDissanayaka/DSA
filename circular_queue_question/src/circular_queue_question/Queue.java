package circular_queue_question;

public class Queue {
	private int front;
	private int rear;
	private int maxSize;
	private int noOfItems;
	private char[] Queue;

	public Queue(int maxSize) { // overload constructor
		this.maxSize = maxSize;
		this.front = 0;
		this.rear = -1;
		this.noOfItems = 0;
		this.Queue = new char[maxSize];
	}

	public void insert(char item) {
		if (isFull()) {
			System.out.println("Queue is Full");
		} else {
			if (rear == maxSize - 1) {
				rear = -1; // circular queue
			}
			Queue[++rear] = item;
			noOfItems++;
		}
	}

	public boolean isFull(){
		return(noOfItems == maxSize);
	}
	
	public boolean isEmpty() {
		return(noOfItems == 0);
	}

	public char remove() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return '\0';
		} else {
			if (front == maxSize) {
				front = 0; // circular queue
			}
			noOfItems--;
			return Queue[front++];
		}
	}

}
