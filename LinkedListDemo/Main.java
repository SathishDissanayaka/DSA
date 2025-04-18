package linkedlist;

class Link {
	public int iData; // data item
	public Link next; // reference to next link in list

	public Link(int item) {
		this.iData = item;
	}

	public void displayLink() {
		System.out.println(this.iData);
	}

}

class LinkedList {
	public Link first; // reference to first link on list

	public LinkedList() {
		this.first = null;
	}

	public boolean isEmpty() {
		return (this.first == null);
	}

	public void insertFirst(int item) {
		Link newLink = new Link(item);
		newLink.next = first;
		first = newLink;
	}

	public void insert(int key, int item) {
		Link current = first;
		while (current != null) {
			if (current.iData == key) {
				Link newLink = new Link(item);
				newLink.next = current.next;
				current.next = newLink;
				return; // stop after first insertion
			}
			current = current.next;
		}
	}

	public boolean find(int key) {
		Link current = first;
		while (current != null) {
			if (current.iData == key) {
				return true;
			} else
				current = current.next;
		}
		return false;
	}

	public void displayList() {
		Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
	}

	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}

//public int deleteFirst() {
// Link temp = first;
// first = first.next;	
// return temp.iData; }

	public Link delete(int key) {
		Link current = first;
		Link previous = null;

		while (current != null) {
			if (current.iData == key) {
				// If deleting the first node
				if (current == first) {
					first = first.next;
				} else {
					previous.next = current.next;
				}
				return current; // Return the deleted node
			}

			previous = current;
			current = current.next;
		}

		return null; // Key not found
	}

}

public class Main {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.insertFirst(10);
		list.insertFirst(20);
		list.insertFirst(30);
		list.insertFirst(40);

		// list.displayList(); // 40,30,20,10
		// list.delete(30);
		// list.displayList();
		// list.insert(30, 35);
		// list.displayList();//40,30,35,20,10

		System.out.println(list.find(40));
		list.deleteFirst();
		list.displayList();

	}

}
