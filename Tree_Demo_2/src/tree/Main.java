package tree;

import java.util.Scanner;

class Node {

	public double ddata;
	public Node leftNode;
	public Node rightNode;

	public Node() {
		leftNode = null;
		rightNode = null;
	}

	public void displayNode() {
		System.out.print(this.ddata + " ");
	}
}

class Tree {
	private Node root;

	public Tree() {
		root = null;
	}

	public Node find(double key) {
		Node current = root;

		while (current != null) {
			if (key == current.ddata) {
				return current;
			} else if (key < current.ddata) {
				current = current.leftNode;
			} else {
				current = current.rightNode;
			}
		}
		return null;
	}

	public void Insert(double data) {
		Node newNode = new Node();
		newNode.ddata = data;

		if (root == null) {
			root = newNode;
		} else {
			Node current = root;
			Node perent;

			while (true) {
				perent = current;

				if (data < current.ddata) {
					current = current.leftNode;

					if (current == null) {
						perent.leftNode = newNode;
						return;
					}
				} else {
					current = current.rightNode;

					if (current == null) {
						perent.rightNode = newNode;
						return;
					}
				}
			}

		}

	}

	private void inOrderTravel(Node localRoot) {
		if (localRoot != null) {
			inOrderTravel(localRoot.leftNode);
			localRoot.displayNode();
			inOrderTravel(localRoot.rightNode);
		}
	}

	public void inOrder() {
		inOrderTravel(root);
	}

}

public class Main {

	public static void main(String[] args) {

		try (Scanner myscanner = new Scanner(System.in)) {
			Tree t1 = new Tree();

			for (int i = 0; i <= 5; i++) {
				System.out.print("Value :");
				double x = myscanner.nextDouble();
				t1.Insert(x);
			}
			System.out.println("Searching for 7.0");
			Node node = t1.find(7.0);
			if (node == null) {
				System.out.println("Not Found");
			} else {
				System.out.println("Found");
			}
			t1.inOrder();

		}
	}

}
