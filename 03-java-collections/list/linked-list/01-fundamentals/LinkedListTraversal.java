/**
 * LinkedListTraversal
 */

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListTraversal {
    public static void main(String[] args) {
        Node head = new Node(5);
        Node second = new Node(15);
        Node third = new Node(25);
        Node fourth = new Node(35);
        Node tail = new Node(45);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = tail;

        Node current = head;
        int count = 1;
        while (current != null) {
            System.out.println("Node " + count + ": " + current.data); // 5 15 25 35 45
            current = current.next;
            count++;
        }

        System.out.println("Traversal completed!"); // Traversal completed!
    }

}