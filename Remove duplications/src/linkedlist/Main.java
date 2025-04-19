package linkedlist;

import java.util.Scanner;

class Link {
	public int data;
	public Link next;

	public Link(int data) {
		this.data = data;
		this.next = null;
	}

	public void dispayLink() {
		System.out.print(this.data + " ");
	}
}

class LinkList {
	public Link first;

	public LinkList() {
		this.first = null;
	}

	public void displayList() {
		Link current = first;

		while (current != null) {
			current.dispayLink();
			current = current.next;
		}
	}

	public boolean find(int key) {

		Link current = first;

		while (current != null) {
			if (current.data == key) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	public void inserFirst(int data) {
		Link link = new Link(data);
		link.next = first;
		first = link;
	}

	public boolean insertAfter(int key, int data) {
		Link current = first;
		Link link = new Link(data);

		while (current != null) {
			if (current.data == key) {
				link.next = current.next;
				current.next = link;

				return true;
			}
			current = current.next;
		}
		return false;
	}

	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}

	public boolean delete(int key) {
		Link current = first;
		Link previous = first;
		while (current != null) {
			if (current.data == key) {
				previous.next = current.next;

				return true;
			}
			previous = current;
			current = current.next;
		}
		return false;
	}

}

public class Main {

	public static void main(String[] args) {

		Scanner myscanner = new Scanner(System.in);
		LinkList list = new LinkList();

		for (int i = 0; i < 5; i++) {
			System.out.print("Enter number : ");
			list.inserFirst(myscanner.nextInt());
		}

		System.out.print("List: ");
		list.displayList();
		System.out.println();

		Link current = list.first;
		while (current != null) {
			Link runner = current;
			while (runner.next != null) {
				if (runner.next.data == current.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			current = current.next;
		}

		System.out.print("List (After remove dublicates): ");
		list.displayList();
		System.err.println();

	}

}
