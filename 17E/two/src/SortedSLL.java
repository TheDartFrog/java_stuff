public class SortedSLL {

    // inner class to represent a node in the linked list
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // head of the linked list
    private Node head;

    public SortedSLL() {
        this.head = null;
    }

    // adds a new element to the linked list in sorted order
    public void addSorted(int data) {
        Node newNode = new Node(data);

        // if the linked list is empty, set the new node as the head
        if (head == null) {
            head = newNode;
            return;
        }

        // if the new element is smaller than the head, insert it before the head
        if (newNode.data < head.data) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // otherwise, find the correct position for the new element and insert it
        Node current = head;
        while (current.next != null && current.next.data < newNode.data) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // prints the elements of the linked list
    public void show() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
