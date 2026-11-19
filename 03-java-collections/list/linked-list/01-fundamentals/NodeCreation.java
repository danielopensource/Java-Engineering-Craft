/**
 * NodeCreation
 */
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class NodeCreation {

    public static void main(String[] args) {
        Node first = new Node(4);
        Node second = new Node(10);
        Node third = new Node(15);
        Node fourth = new Node(20);

        first.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println("Second Node: " + first.next.data); // Second Node: 10
        System.out.println("Fourth Node: " + first.next.next.next.data); // Fourth Node: 20
        System.out.println("Last Node Next: " + first.next.next.next.next); // Last Node Next: null
    }
}