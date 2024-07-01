package com.datastructure;

class Node {
	int key;
	Node prev;
	Node next;

	Node() {
		prev = null;
		next = null;
	}
}

class DoublyLinkedList {
	static Node head = null;
	static Node first = null;
	static Node tail = null;
	static Node temp = null;
	static int i = 0;

	// Add a node
	static void addNode(int k) {
		Node ptr = new Node();
		// assignin key
		ptr.key = k;
		// next and prev ptr to null
		ptr.next = null;
		ptr.prev = null;
		// if linked list is empty
		if (head == null) {
			head = ptr;
			first = head;
			tail = head;
		} else {// insert at the end of the linkedlist
			temp = ptr;
			first.next = temp;
			temp.prev = first;
			first = temp;
			tail = temp;
		}
		// increment no.of nodes
		i++;
	}

	// traverse the list
	static void traverse() {
		// Nodes points towards head node
		Node ptr = head;
		// while ptr is not null,traverse and print node
		while (ptr != null) {
			System.out.println(ptr.key + " ");
			ptr = ptr.next;
		}
		System.out.println();
	}

	// insert a node at the beginning
	static void insertAtBeginning(int k) {
		Node ptr = new Node();
		ptr.key = k;
		ptr.next = null;
		ptr.prev = null;
		if (head == null) {
			first = ptr;
			first = head;
			tail = head;
		} else {
			temp = ptr;
			temp.next = head;
			head.prev = temp;
			head = temp;
		}
		i++;
	}

	static void insertAtEnding(int k) {
		Node ptr = new Node();
		ptr.key = k;
		ptr.next = null;
		ptr.prev = null;
		if (head == null) {
			first = ptr;
			first = head;
			tail = head;
		} else {
			temp = ptr;
			temp.prev = tail;
			tail.next = temp;
			tail = temp;
		}
		i++;
	}
	//insert at position 
	static void insertAtPosition(int k, int pos) {
		if (pos < 1 || pos > i + 1) {
			System.out.println("Enter a valid position");
		} else if (pos == 1) {
			insertAtBeginning(k);
		} else {
			// traverse till position pos
			Node src = head;
			// Moving head pointer to pos
			while (pos-- != 0) {
				src = src.next;
			}

			// Allocate memory to new node
			Node nodeA, nodeB;
			Node ptr = new Node();
			ptr.next = null;
			ptr.prev = null;
			ptr.key = k;

			// change the prev and next pointer of nodes inserted
			nodeB = src;
			nodeA = (src.prev);
			ptr.next = (nodeB);
			ptr.prev = (nodeA);
			nodeA.next = ptr;
			nodeB.prev = ptr;
			i++;
		}
	}

	// delete Node at beginning
	static void deleteAtBeginning() {
		// move head to next and decrease length by 1
		head = head.next;
		i--;
	}

	// delete at end
	static void deleteAtEnd() {
		tail = tail.prev;
		tail.next = null;
		i--;
	}

	// delete ate specific position
	static void deleteAtpos(int pos) {
		if (pos < 1 || pos > i + 1) {
			System.out.println("ENter a valid position");
		} else if (pos == 1) {
			deleteAtBeginning();

		} else if (pos == i) {
			deleteAtEnd();
		} else {
			Node src = head;
			pos--;

			while (pos-- != 0) {
				src = src.next;
			}
			Node prev, aftr;
			prev = (src.prev);
			aftr = (src.next);

			prev.next = (aftr);
			aftr.prev = (prev);
			i--;
		}

	}
}

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList list = new DoublyLinkedList();
		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		list.addNode(40);
		list.addNode(50);
		list.addNode(60);
		list.addNode(70);
		list.addNode(80);
		list.addNode(90);
		list.addNode(100);

		list.traverse();
		list.insertAtBeginning(110);
		list.traverse();
		list.insertAtEnding(120);
		list.traverse();
		list.insertAtPosition(130, 7);
		list.traverse();
		list.deleteAtBeginning();
		list.traverse();
		list.deleteAtEnd();
		list.traverse();

		list.deleteAtpos(4);
		list.traverse();
	}

}