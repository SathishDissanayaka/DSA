package circular_queue_question;

public class Stack {
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
