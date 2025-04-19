package linkedlist;

import java.util.Scanner;

class Stack {

	private int top;
	private int maxSize;
	private int intArray[];

	public Stack(int maxSize) {
		this.maxSize = maxSize;
		this.intArray = new int[maxSize];
		this.top = -1;
	}

	public boolean isFull() {
		return top == maxSize - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public int peek() {
		return intArray[top];
	}

	public void push(int c) {
		if (isFull()) {
			System.out.println("Stack is full");
		} else {
			intArray[++top] = c;
		}
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		} else {
			return intArray[top--];
		}
	}

}

public class Main {

	public static void main(String[] args) {

		Scanner myscanner = new Scanner(System.in);
		System.out.print("Enter decimal number :");
		int decimal = myscanner.nextInt();

		Stack binary = new Stack(100);

		while (decimal != 0) {
			if (decimal % 2 == 0) {
				binary.push(0);
			} else {
				binary.push(1);
			}
			decimal = decimal / 2;
		}

		while (!binary.isEmpty()) {
			System.out.println(binary.pop() );
		}
	}

}
