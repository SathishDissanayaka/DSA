package Sort_stack_using_temporary_stack;

public class Stack {
	
	private int top;
	private int maxSize;
	private int intArray[];
	
	
	public Stack(int maxSize) {
		this.maxSize = maxSize;
		this.intArray = new int[maxSize];
		this.top = -1;
	}
	
	public boolean isFull() {
		return top == maxSize-1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public int peek() {
		return intArray[top];
	}
	
	public void push(int c) {
		if(isFull()) {
			System.out.println("Stack is full");
		}else {
			intArray[++top] = c;
		}
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}else {
			return intArray[top--];
		}
	}
	

}
