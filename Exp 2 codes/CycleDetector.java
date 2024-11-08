// Java program to detect loop in a linked list
// using hashset
import java.util.HashSet;
import java.util.Set;

class Node {
    int data;
    Node next;

    Node(int new_data) {
        this.data = new_data;
        this.next = null;
    }
}

class CycleDetector {

    // Function that returns true if there is a loop in
    // linked list else returns false.
    static boolean detectLoop(Node head) {
        Set<Node> set = new HashSet<>();

        // loop that runs till the head is null
        while (head != null) {

            // If this node is already present
            // in hashmap it means there is a cycle
            // (Because you will be encountering the
            // node for the second time).
            if (set.contains(head))
                return true;

            // If we are seeing the node for
            // the first time, insert it in hash
            set.add(head);

            head = head.next;
        }
        return false;
    }

    // Driver code
    public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 3 -> 23 -> 7 -> 2 -> 77
        Node head = new Node(3);
        head.next = new Node(23);
        head.next.next = new Node(7);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(77);

        // Creating a loop resulting in the linked list:
        // 3 -> 23 -> 7 -> 2 -> 77 -> 3 -> 23 ...
        head.next.next.next.next = head;

        if (detectLoop(head))
            System.out.println("Loop Found");
        else
            System.out.println("No Loop");
    }
}
