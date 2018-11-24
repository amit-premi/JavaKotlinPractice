package com.practice.java.linklist;

public class LinkListReverse {

    private LinkList head;

    private static class LinkList {
        int data;
        LinkList next;

        LinkList(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "LinkList{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    public static void main(String[] args) {
        LinkListReverse list = new LinkListReverse();

        LinkList headNode = new LinkList(5);
        list.addLastElement(headNode);
        list.addLastElement(new LinkList(19));
        list.addLastElement(new LinkList(25));
        list.addLastElement(new LinkList(50));
        list.addLastElement(new LinkList(15));
        list.addLastElement(new LinkList(35));
        list.addLastElement(new LinkList(40));
        list.addLastElement(new LinkList(85));
        list.addLastElement(new LinkList(125));

        System.out.print("LinkList created: ");
        list.printList(headNode);

        System.out.println("\nMiddle Node: " + list.findMiddleNode(headNode).data);

        System.out.print("Link list length(): " + list.listLength(headNode));

        LinkList nNodeFromEnd = list.nthFromLastNode(headNode, 5);
        System.out.print("\nNth Node element: " + nNodeFromEnd.data);

        System.out.print("\nReversed LinkList: ");
        LinkList reversedList = list.reverseFromMiddle(headNode);
        list.printList(reversedList);
        //list.printList(list.reverseList(headNode));
    }

    private void addLastElement(LinkList nodeAdd) {
        if (head == null) {
            head = nodeAdd;
            //System.out.println("If head == null: "+nodeAdd);
        } else {
            //System.out.println("Else head != null Before: "+head.toString());
            LinkList temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = nodeAdd;
            //System.out.println("Else head != null After: "+head.toString());
        }
    }

    private void printList(LinkList nodeP) {
        LinkList temp = nodeP;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    private LinkList reverseList(LinkList currentNode) {
        LinkList previousNode = null, nextNode;
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

    private int listLength(LinkList nodeE) {
        int length = 0;

        LinkList temp = nodeE;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    private LinkList nthFromLastNode(LinkList nNode, int n) {
        LinkList firstPtr = nNode;
        LinkList secondPtr = nNode;

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

    private LinkList findMiddleNode(LinkList head) {
        // step 1
        LinkList slowPointer, fastPointer;
        slowPointer = fastPointer = head;

        while (fastPointer != null) {
            //System.out.println("\nFast Pointer: " + fastPointer.toString());
            fastPointer = fastPointer.next;
            if (fastPointer != null && fastPointer.next != null) {
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next;
            }
        }
        return slowPointer;
    }

    /**
     * Method to reverse the LinkList from Middle
     *
     * @param currentList = linkList
     * @return = reversed list
     */
    private LinkList reverseFromMiddle(LinkList currentList) {
        int length = listLength(currentList);
        LinkList prevNode = null, nextNode = null;
        LinkList newTempList = null;

        int count = 0;
        while (count <= length / 2) {
            if (newTempList == null) {
                newTempList = new LinkList(currentList.data);
            } else {
                LinkList temp = newTempList;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = new LinkList(currentList.data);
            }
            currentList = currentList.next;
            count++;
        }

        System.out.print("TempNodeList created: ");
        printList(newTempList);
        System.out.println("");

       /* System.out.print("\nCurrentList created: ");
        printList(currentList);*/

        while (currentList != null) {
            nextNode = currentList.next;
            currentList.next = prevNode;

            prevNode = currentList;
            currentList = nextNode;

            LinkList temp1 = newTempList;
            assert temp1 != null;
            while (temp1.next != null) {
                temp1 = temp1.next;
            }
            temp1.next = prevNode;
        }

       /* System.out.print("TempNodeList created: ");
        printList(tempList);

        System.out.print("\nCurrentList created: ");
        printList(currentList);*/

        return newTempList;
    }

    private LinkList createTempList(LinkList linkList) {
        LinkList newList = null;
        while (linkList != null) {
            if (newList == null)
                newList = new LinkList(linkList.data);

            while (newList.next != null) {
                newList = newList.next;
            }
            newList.next = new LinkList(linkList.data);

            linkList = linkList.next;
        }
        return newList;
    }
}
