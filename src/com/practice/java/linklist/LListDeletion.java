package com.practice.java.linklist;

import java.util.Scanner;

public class LListDeletion {

	private static LList head;

	static class LList{
		private int data;
		private LList next;

		public LList(int d) {
			this.data = d;
		}

		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return "LList [data=" + data + ", next=" + next + "]";
		}
	}

	public static void main(String args[]) {

		LListDeletion listD = new LListDeletion();

		listD.addElementAtLast(5);
		listD.addElementAtLast(25);
		listD.addElementAtLast(54);
		listD.addElementAtLast(235);
		listD.addElementAtLast(105);
		listD.addElementAtLast(58);

		System.out.print("Link list created: ");
		listD.printLList(head);

		System.out.println("\nLink list length before delete: "+listD.listLength(head));

		//List node deletion operation
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter node position to be deleted: ");
		int posD = sc.nextInt();
		listD.deleteNodeFromHead(posD);
		System.out.print("\nLink list After deletion from head: ");
		listD.printLList(head);
		System.out.println("\nLink list length after delete: "+listD.listLength(head));
	}

	//Method to add elements to a link list
	private void addElementAtLast(int dataA) {
		if(head == null) {
			head = new LList(dataA);
		}else {

			//System.out.println("Head Node: "+head);
			LList tempNode = head;
			while(tempNode.next != null) {
				tempNode = tempNode.next;
			}
			/*head.setData(dataA);
			tempNode.next = new LList(head.getData());*/
			tempNode.next = new LList(dataA);
		}
	}

	//Method to print the elements of the Link list
	private void printLList(LList nodeP) {
		if(nodeP == null) {
			return;
		}else {
			while(nodeP != null) {
				/*System.out.print(nodeP.data +" ");*/
				System.out.print(nodeP.getData() +" ");
				nodeP = nodeP.next;
			}
		}
	}

	//Method to find the length of the link list
	private int listLength(LList nodeL) {
		int length = 0;
		while(nodeL != null) {
			length++;
			nodeL = nodeL.next;
		}
		return length;
	}

	//Method to delete a node from Head position
	private void deleteNodeFromHead(int pos) {
		if(head == null || (pos < 0)) {
			return;
		}

		if(pos == 0) {
			head = head.next;
			return;
		}else if(pos >= listLength(head)){
			return;
		}else{
			int length = 1;
			LList tempNode = head;
			while(tempNode != null) {
				if(pos == length) {
					LList nextNode = tempNode.next.next;
					tempNode.next = nextNode;
					return;
				}
				tempNode = tempNode.next;
				length++;
			}
		}
	}
}