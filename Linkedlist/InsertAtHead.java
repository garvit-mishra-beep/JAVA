class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
public class InsertAtHead {
    public static Node insertAtBeginning(Node head, int x) {
        Node newNode = new Node(x);
        newNode.next = head;
        return newNode;
    }

    // Helper method to print the linked list
    public static void printList(Node head) {
        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.data + (temp.next != null ? " -> " : ""));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Initial list: 2 -> 10
        Node head = new Node(2);
        head.next = new Node(10);
        System.out.print("Original list: ");
        printList(head);

        // Insert 1 at the beginning
        head = insertAtBeginning(head, 1);
        System.out.print("Modified list: ");
        printList(head);
    }
}
