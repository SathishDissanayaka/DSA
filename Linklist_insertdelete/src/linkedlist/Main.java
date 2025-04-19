package linkedlist;

import java.util.Scanner;

class Link {
	public double data ;
	public Link next;
	
	public Link(double data) {
		this.data = data;
		this.next = null;
	}
	public void dispayLink() {
		System.out.print(this.data+" ");
	}
}


class LinkList {
	private Link first;
	
	public LinkList() {
		this.first = null;
	}
	
	public void displayList() {
		Link current = first;
		
		while(current != null) {
			current.dispayLink();
			current = current.next;
		}
	}
	
	public boolean find(double data) {
		
		Link current = first;
		
		while(current != null) {
			if(current.data == data) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	public void inserFirst(double data) {
		Link link = new Link(data);
		link.next = first;
		first = link;
	}
	
	public boolean insertAfter(double data) {
		Link current = first;
		Link link = new Link(data);
		
		while(current != null) {
			if(current.data == data) {
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
	
	public boolean deleteLink(double data) {
		Link current = first;
		Link previous = first;
		while(current != null) {
			if(current.data == data) {
				previous.next = current.next;
				
				return true;
			}
			previous = current;
			current = current.next;
		}
		return false;
	}

}


/*
Q1) Write a main method to create a linked list. Insert three elements into the linked list 
(at the beginning). Then delete two elements from the list and display the list after each 
insertion and deletion. 

Sample Output: 

Inserted: 7.2 
List: 7.2  
Inserted: 5.5 
List: 5.5 7.2  
Inserted: 9.8 
List: 9.8 5.5 7.2  
Deleted: 9.8 
List: 5.5 7.2  
Deleted: 5.5 
List: 7.2 
*/

public class Main {

	public static void main(String[] args) {

		Scanner myscanner = new Scanner(System.in);
		LinkList list = new LinkList();
		
		for(int i=0;i<3;i++) {
			System.out.print("Inserted : ");
			double d = myscanner.nextDouble();
			System.out.print("List : ");
			list.inserFirst(d);
			list.displayList();
			System.out.println();
		}

       for(int i=0;i<2;i++) {
    	   System.out.print("Deleted : ");
    	   double d = myscanner.nextDouble();
    	   list.deleteLink(d);
    	   list.displayList();
    	   System.out.println();
    	   
       }
}
}
