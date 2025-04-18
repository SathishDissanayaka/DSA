package question1;

import java.util.Scanner;

class Stack {
	private int maxSize;
	private int top;
	private char[] stackArray;

	public Stack(int maxSize) {
		this.maxSize = maxSize;
		this.stackArray = new char[maxSize];
		top = -1;
	}

	public void push(char item) {
		if (isFull()) {
			System.out.println("Stack is Full");
		} else {
			stackArray[++top] = item;
		}
	}

	public char pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return '\0'; // null character
		} else {
			return stackArray[top--];
		}
	}

	public boolean isFull() {
		return (top == maxSize - 1);
	}

	public boolean isEmpty() {
		return (top == -1);
	}

}

class Queue {
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

	public boolean isFull() {
		return (noOfItems == maxSize);
	}

	public boolean isEmpty() {
		return (noOfItems == 0);
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

public class Main {

	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);

		Queue q1 = new Queue(5);
		Stack s1 = new Stack(5);

		for (int i = 0; i <= 4; i++) {
			System.out.print(" Ïtem : ");
			char c = myscanner.next().charAt(0);
			q1.insert(c);
		}

		for (int i = 0; i <= 4; i++) {
			s1.push(q1.remove());
		}

		for (int i = 0; i <= 4; i++) {
			q1.insert(s1.pop());
		}

		for (int i = 0; i <= 4; i++) {
			System.out.println(q1.remove());
		}

	}

}
