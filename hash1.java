package Coding;
import java.util.HashSet;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }
}

public class hash1 {
    public static void main(String[] args) {
        CircularLinkedList circularList = new CircularLinkedList();
        HashSet<Node> nodeSet = new HashSet<>();

        circularList.insert(1);
        circularList.insert(2);
        circularList.insert(3);

        Node current = circularList.head;
        do {
            System.out.println("Node data: " + current.data);
            nodeSet.add(current);
            current = current.next;
        } while (current != circularList.head);

        Node nodeToCheck = circularList.head;
        if (nodeSet.contains(nodeToCheck)) {
            System.out.println("Node with data " + nodeToCheck.data + " is present in the HashSet");
        } else {
            System.out.println("Node with data " + nodeToCheck.data + " is not present in the HashSet");
        }
    }
}
