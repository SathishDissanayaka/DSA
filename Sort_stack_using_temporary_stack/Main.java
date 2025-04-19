package Sort_stack_using_temporary_stack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Stack stack = new Stack(5);
		stack.push(23);
		stack.push(63);
		stack.push(13);
		stack.push(11);
		stack.push(5);
		
		Stack tempStack = new Stack(5);
		
		while(!stack.isEmpty()) {
			int temp = stack.pop();
			
			while(!tempStack.isEmpty() && tempStack.peek() < temp) {
				stack.push(tempStack.pop());
			}
			
			tempStack.push(temp);
		}
		
		while(!tempStack.isEmpty()) {
			System.out.print(tempStack.pop()+ " ");
		}
	}
}
