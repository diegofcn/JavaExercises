package Datastructures;


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedList {
    Node head;

    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if (position == 0){
            newNode.next = head;
            head = newNode;
        } else {
            Node previous = null;
            Node current = head;
            int i = 0;

            while (current != null && i < position) {
                previous = current;
                current = current.next;
                i++;
            }

            newNode.next = current;
            previous.next = newNode;
        }
    }

    void remove(int key) {
        Node previous = null;
        Node current = head;

        if (current != null && current.data == key) {
            head = current.next;
            return;
        }

        while (current != null && current.data != key) {
            previous = current;
            current = current.next;
        }

        if (current != null) {
            previous.next = current.next;
        }
    }

    void printList() {
        Node node = head;
        while (node != null) {
            System.out.println(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtBeginning(0);
        list.insertAtPosition(1, 1); // Insert 1 at position 1
        list.remove(0); // Remove 0 from the list
        list.printList();
    }
}
