import java.io.*; 
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
	private class Node { 
		int data; 
		Node next; 
	} 
       	Node head; // head of list 
	public LinkedList insert(LinkedList list, int data1) 
	{ 
		// Create a new node with given data 
		Node new_node = new Node(); 
		new_node.next = null;
                new_node.data=data1;

		// If the Linked List is hollow, 
		// then make the new node as head 
		if (list.head == null) { 
			list.head = new_node; 
		} 
		else { 
			// Else navigate till the last node 
			// and insert the new_node there 
			Node last = list.head; 
			while (last.next != null) { 
				last = last.next; 
			} 

			// Insert the new_node at last node 
			last.next = new_node; 
		} 

		// Return the list by head 
		return list; 
	} 

	// Method to print the LinkedList. 
	public void travers_show(LinkedList list) 
	{ 
		Node currNode = list.head; 
		System.out.print("LinkedList: "); 
		// Traverse through the LinkedList 
		while (currNode != null) { 
			// Print the data at current node 
			System.out.print(currNode.data + " "); 

			// Go to next node 
			currNode = currNode.next; 
		} 
	} 

} 


// by.Basil Farra





