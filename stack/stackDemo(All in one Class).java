package stackDemo;

public class Main {

	public static class Stack {
		private int maxSize;
		private double[] stackArray;
		private int top;

		public Stack(int maxSize) {
			this.maxSize = maxSize;
			this.stackArray = new double[maxSize];
			top = -1;
		}

		public void push(double num) {
			if (top == maxSize - 1) {
				System.out.println("Stack is full");
			} else {
				stackArray[++top] = num;
			}
		}

		public double pop() {
			if (top == -1) {
				System.out.println("Stack is Empty");
				return 0;
			} else {
				return stackArray[top--];
			}
		}

		public double peek() {
			if (top == -1) {
				System.out.println("Stack is Empty");
				return 0;
			} else {
				return stackArray[top];
			}
		}
	}

	public static void main(String[] args) {
		Stack s1 = new Stack(5);
		s1.push(10.1);
		s1.push(20.1);
		s1.push(30.1);
		s1.push(40.1);
		s1.push(50.1);

		System.out.println(s1.peek());
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.peek());
	}

}
