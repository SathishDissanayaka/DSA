package queueDemo;

public class MainQueue {

	public static class Queue {

		private int rear;
		private int front;
		private int maxSize;
		private int noOfItems;
		private int[] queueArray;

		public Queue(int maxSize) {
			this.maxSize = maxSize;
			this.front = 0;
			this.rear = -1;
			this.noOfItems = 0;
			this.queueArray = new int[maxSize];
		}

		public void insert(int item) {
			if (isFull()) {
				System.out.println("Queue is Full now");
			} else {
				queueArray[++rear] = item;
				noOfItems++;
			}
		}

		public int remove() {
			if (isEmpty()) {
				System.out.println("Queue is Empty");
			}
			else {
				noOfItems--;
				return (queueArray[front++]);
			}
			return 0;
		}

		public int peekFront() {
			if (isEmpty()) {
				System.out.println("Queue is Empty");
			}
			else {
				return (queueArray[front]);
			}
			return 0;
		}

		public boolean isFull() {
			return (rear == maxSize - 1);
		}

		public boolean isEmpty() {
			return (noOfItems == 0);
		}

	}

	public static void main(String[] args) {

		  Queue q1 = new Queue(5);
		  
		  q1.insert(10);
		  q1.insert(20);
		  q1.insert(30);
		  q1.insert(40);
		  q1.insert(50);
		  
		  System.out.println(q1.remove()); //10
		  System.out.println(q1.peekFront()); //20
	}

}
