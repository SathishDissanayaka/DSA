package linkedlist;

import java.util.Scanner;

class Stack {

	private int top;
	private int maxSize;
	private char charArray[];

	public Stack(int maxSize) {
		this.maxSize = maxSize;
		this.charArray = new char[maxSize];
		this.top = -1;
	}

	public boolean isFull() {
		return top == maxSize - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void push(char c) {
		if (isFull()) {
			System.out.println("Stack is full");
		} else {
			charArray[++top] = c;
		}
	}

	public char pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return ' ';
		} else {
			return charArray[top--];
		}
	}

}

public class Main {

	public static void main(String[] args) {

		Scanner myscanner = new Scanner(System.in);
		System.out.print("Enter a String :");
		String string = myscanner.nextLine();

		char stringArr[] = string.toCharArray();
		Stack s1 = new Stack(stringArr.length);

		for (int i = 0; i <stringArr.length; i++) {
			s1.push(stringArr[i]);
		}

		System.out.print("RevErse String : ");
		for (int i = 0; i < stringArr.length; i++) {
			System.out.print(s1.pop());
		}

	}
}
