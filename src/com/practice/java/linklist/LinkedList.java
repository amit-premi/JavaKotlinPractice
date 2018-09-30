package com.practice.java.linklist;

public class LinkedList{

	private Node head;

	private class Node {
		private int value;
		private Node next;

		Node(int value) {
			this.value = value;
		}
	}

	private void addToTheLast(Node node) {
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}


	private void printList(Node headNode) {
		Node temp = headNode;
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
		System.out.println();
	}

	// Reverse linkedlist using this function 
	private static Node reverseLinkedList(Node currentNode)
	{
		// For first node, previousNode will be null
		Node previousNode=null;
		Node nextNode;
		while(currentNode!=null)
		{
			nextNode=currentNode.next;
			// reversing the link
			currentNode.next=previousNode;
			// moving currentNode and previousNode by 1 node
			previousNode=currentNode;
			currentNode=nextNode;
		}
		return previousNode;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		// Creating a linked list
		Node nodeHead=(new LinkedList()).new Node(5);
		list.addToTheLast(nodeHead);
		list.addToTheLast((new LinkedList()).new Node(6));
		list.addToTheLast((new LinkedList()).new Node(7));
		list.addToTheLast((new LinkedList()).new Node(1));
		list.addToTheLast((new LinkedList()).new Node(2));

		list.printList(nodeHead);
		//Reversing LinkedList
		Node reverseHead=reverseLinkedList(nodeHead);
		System.out.println("After reversing");
		list.printList(reverseHead);
	}
}