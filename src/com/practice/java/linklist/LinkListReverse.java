package com.practice.java.linklist;

public class LinkListReverse {

    private Node head;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node [data=" + data + ", next=" + next + "]";
        }

    }

    private void addLastElement(Node nodeAdd) {
        if (head == null) {
            head = nodeAdd;
            //System.out.println("If head == null: "+nodeAdd);
        } else {
            //System.out.println("Else head != null Before: "+head.toString());
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = nodeAdd;
            //System.out.println("Else head != null After: "+head.toString());
        }
    }

    private void printList(Node nodeP) {
        Node temp = nodeP;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    private Node reverseList(Node currentNode) {
        Node previousNode = null;
        Node nextNode = null;
        while (currentNode != null) {

            nextNode = currentNode.next;

            //Pointer reverse
            currentNode.next = previousNode;
            //Moving 1 step back
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }

    private int listLength(Node nodeE) {
        int length = 0;

        Node temp = nodeE;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    private Node nthFromLastNode(Node nNode, int n) {
        Node firstPtr = nNode;
        Node secondPtr = nNode;

        //System.out.println("\nFirst Node: "+firstPtr.toString());
        //System.out.println("Second Node: "+secondPtr.toString());

        for (int i = 0; i < n; i++) {
            firstPtr = firstPtr.next;
            //System.out.println("First Node FOR LOOP: "+firstPtr.toString());
        }
        //System.out.println("First Node After N Iteration: "+firstPtr.toString());

        while (firstPtr != null) {
            firstPtr = firstPtr.next;
            secondPtr = secondPtr.next;

            //System.out.println("Second Node Lower WHILE: "+secondPtr.toString());
        }
        return secondPtr;
    }

    private Node findMiddleNode(Node head) {
        // step 1
        Node slowPointer, fastPointer;
        slowPointer = fastPointer = head;

        while (fastPointer != null) {
            System.out.println("\nFast Pointer: " + fastPointer.toString());
            fastPointer = fastPointer.next;
            if (fastPointer != null && fastPointer.next != null) {
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next;
            }
            System.out.println("Fast Pointer: " + fastPointer.toString());
            System.out.println("Slow Pointer: " + slowPointer.toString());
        }
        return slowPointer;
    }

    public static void main(String[] args) {
        LinkListReverse list = new LinkListReverse();

        Node headNode = new Node(5);
        list.addLastElement(headNode);
        list.addLastElement(new Node(19));
        list.addLastElement(new Node(25));
        list.addLastElement(new Node(50));
        list.addLastElement(new Node(15));
        list.addLastElement(new Node(35));
        list.addLastElement(new Node(40));
        list.addLastElement(new Node(85));

        System.out.print("LinkList created: ");
        list.printList(headNode);

        System.out.println("Middle Node: " + list.findMiddleNode(headNode));

        System.out.print("\nLink list length(): " + list.listLength(headNode));

        Node nNodeFromEnd = list.nthFromLastNode(headNode, 5);
        System.out.print("\nNth Node element: " + nNodeFromEnd.data);

        System.out.print("\nReversed LinkList: ");
        list.printList(list.reverseList(headNode));
    }
}
