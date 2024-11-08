
/*
reverese a a given linked list whose elemts should be taken at runtime from user 
and display the original and reversed linked list in java
Here's how the program works:

The user is prompted to enter the number of elements in the linked list.
The user is then prompted to enter each element of the linked list.
The elements are added to the linked list using the addNode method.
The original linked list is displayed using the displayList method.
The linked list is reversed using the reverseList method.
The reversed linked list is displayed using the displayList method.
Note that the reverseList method uses a simple iterative approach to reverse the linked list. 
It keeps track of the previous node, current node, and next node, and updates the next pointers accordingly*/
import java.util.Scanner;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void addNode(int data) {
        Node node = new Node(data);
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

    void displayList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    Node reverseList(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}

public class ReverseLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.addNode(scanner.nextInt());
        }

        System.out.println("Original Linked List:");
        list.displayList(list.head);

        Node reversedHead = list.reverseList(list.head);
        System.out.println(" ");
        System.out.println("Reversed Linked List:");
        list.displayList(reversedHead);
        scanner.close();
    }
}
