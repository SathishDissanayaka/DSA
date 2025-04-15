package stack;

public class Stack {
	private int maxSize;
	private double[] stackArray;
	private int top;

	public Stack(int maxSize) {
		this.maxSize = maxSize;
		this.stackArray = new double[maxSize];
		top = -1;
	}

	public void push(double num) {
		if (top == maxSize - 1) {//isFull()
			System.out.println("Stack is already full!");
		} else {
			stackArray[++top] = num;
		}
	}

	public double pop() {
		if (top == -1) {//isEmpty()
			System.out.println("Stack is Empty");
			return 0;
		} else {
			return stackArray[top--];
		}
	}

	public double peek() {
		if (top == -1) {//isEmpty()
			System.out.println("Stack is Empty");
			return 0;
		} else {
			return stackArray[top];
		}
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (top == maxSize - 1) {
			return true;
		}
		return false;
	}
}
