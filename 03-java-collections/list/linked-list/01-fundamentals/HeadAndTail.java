/**
 * HeadAndTail
 */
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class HeadAndTail {

    public static void main(String[] args) {
        Node head = new Node(5);
        Node second = new Node(5);
        Node third = new Node(5);
        Node tail = new Node(5);

        head.next = second;
        second.next = third;
        third.next = tail;

        System.out.println("Head: " + head.data);
        System.out.println("Tail: " + tail.data);
        System.out.println("Tail Next: " + tail.next);
    }
}