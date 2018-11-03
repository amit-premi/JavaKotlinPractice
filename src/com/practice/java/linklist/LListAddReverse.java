package com.practice.java.linklist;

import java.util.Scanner;

public class LListAddReverse {

    private static LListNode headFirst;
    private static LListNode headEnd;

    private static class LListNode {
        int data;
        LListNode next;

        LListNode(int d) {
            this.data = d;
            this.next = null;
        }

        @Override
        public String toString() {
            return "LListNode [data=" + data + ", next=" + next + "]";
        }
    }

    public static void main(String[] args) {
        LListAddReverse list = new LListAddReverse();
        LListNode endNode = new LListNode(4);

        list.addElementAtLast(endNode);
        list.addElementAtLast(new LListNode(15));
        list.addElementAtLast(new LListNode(28));
        list.addElementAtLast(new LListNode(71));
        list.addElementAtLast(new LListNode(95));
        list.addElementAtLast(new LListNode(45));
        list.addElementAtLast(new LListNode(120));
        list.addElementAtLast(new LListNode(86));

        System.out.println("Link list Items Added at Last Node: ");
        list.printList(headEnd);

        System.out.println("\n\nLink list Reverse: ");
        list.printList(list.reverseList(headEnd));


        LListNode headNode = new LListNode(4);
        list.addElementAtFirst(headNode);
        list.addElementAtFirst(new LListNode(15));
        list.addElementAtFirst(new LListNode(28));
        list.addElementAtFirst(new LListNode(71));
        list.addElementAtFirst(new LListNode(95));
        list.addElementAtFirst(new LListNode(45));
        list.addElementAtFirst(new LListNode(120));
        list.addElementAtFirst(new LListNode(86));
        System.out.println("\n\nLink list Items Added at First Node: ");
        list.printList(headFirst);

        System.out.println("\n\nLink list Size: " + list.listLength(headFirst));

        LListNode headLList = list.addElementAtFirst(headFirst, 45);
        System.out.println("\n\nLink list Items Added at First Node With Data: ");
        list.printList(headLList);

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\nEnter element value: ");
        int value = scanner.nextInt();
        System.out.print("\nEnter element position: ");
        int position = scanner.nextInt();
        try {
            list.addElementAtPos(new LListNode(value), position);
        } catch (InsertAtPosInvalidException e) {
            e.printStackTrace();
        }
        System.out.println("\nLink list After addition: ");
        list.printList(headFirst);

        scanner.close();
    }

    //Method to add element at last of link list
    private void addElementAtLast(LListNode nodeLast) {
        if (headEnd == null) {
            headEnd = nodeLast;
        } else {
            LListNode tempNode = headEnd;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = nodeLast;
        }
    }

    //Method to add the element at head node of link list
    private void addElementAtFirst(LListNode nodeFirst) {
        if (headFirst == null) {
            headFirst = nodeFirst;
        } else {
            nodeFirst.next = headFirst;
            headFirst = nodeFirst;
        }
    }

    //Method to add the element at head node of link list
    private LListNode addElementAtFirst(LListNode lListNode, int data) {
        if (lListNode == null) return null;

        LListNode tempListNode = new LListNode(data);

        tempListNode.next = lListNode;
        lListNode = tempListNode;

        return lListNode;
    }

    //Method to add element at provided position in link list
    private void addElementAtPos(LListNode nodeAdd, int pos) throws InsertAtPosInvalidException {
        int length = 0;
        if (headFirst == null) {
            headFirst = nodeAdd;
        } else if (pos < 0 || pos > (listLength(headFirst) - 1)) {
            throw new InsertAtPosInvalidException("Invalid position provided: As it's greater than link list length");
        } else if (pos == 0) {
            nodeAdd.next = headFirst;
            headFirst = nodeAdd;
        } else {

            //System.out.println("***** Add Element CurrentList: "+headFirst);
            LListNode prevNode = null;
            LListNode currentNode = null;
            LListNode tempNode = headFirst;

            while (tempNode != null) {
                prevNode = currentNode;
                currentNode = tempNode;
                tempNode = tempNode.next;

                if (pos == length) {
                    prevNode.next = nodeAdd;
                    nodeAdd.next = currentNode;
                }
                length++;
            }
        }
    }

    //Method to print the link list
    private void printList(LListNode nodePrint) {
        while (nodePrint != null) {
            System.out.print(nodePrint.data + " ");
            nodePrint = nodePrint.next;
        }
    }

    //Method to reverse the link list
    private LListNode reverseList(LListNode currentNode) {
        LListNode previousNode = null;
        LListNode nextNode = null;

        while (currentNode != null) {
            nextNode = currentNode.next;

            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }

    //Method to find the length of link list
    private int listLength(LListNode nodeL) {
        int length = 0;
        while (nodeL != null) {
            length++;
            nodeL = nodeL.next;
        }
        return length;
    }
}
