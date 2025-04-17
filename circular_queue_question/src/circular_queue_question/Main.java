package circular_queue_question;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner myscanner = new Scanner(System.in);
		System.out.println("Input items : ");

		Queue q1 = new Queue(10);
		Stack s1 = new Stack(5);

		char item;
		for (int i = 0; i <= 4; i++) {
			System.out.print("Item : ");
			item = myscanner.next().charAt(0);
			q1.insert(item); // V W X Y Z
		}

		for (int i = 0; i <= 4; i++) {
			s1.push(q1.remove()); // V W X Y Z
		}

		for (int i = 0; i <= 4; i++) {
			q1.insert(s1.pop()); // Z Y X W V
		}

		Queue q2 = new Queue(5);

		for (int i = 0; i <= 4; i++) {
			char c = q1.remove();
			q2.insert(c);
			s1.push(c);
		}

		for (int i = 0; i <= 4; i++) {
			q1.insert(q2.remove());
		}

		for (int i = 0; i <= 4; i++) {
			q1.insert(s1.pop());
		}

		System.out.println("Final Queue Items : ");
		for (int i = 0; i <= 9; i++) {
			System.out.println("Item : " + q1.remove());
		}

	}

}
