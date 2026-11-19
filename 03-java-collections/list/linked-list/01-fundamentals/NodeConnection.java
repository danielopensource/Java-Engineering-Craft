
/**
 * NodeConnection
 */

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class NodeConnection {

    public static void main(String[] args) {

        Node first = new Node(100);
        Node second = new Node(200);
        Node third = new Node(300);
        Node fourth = new Node(400);

        first.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println("Third Node: " + first.next.next.data); // Third Node: 300
        System.out.println("Fourth Node: " + first.next.next.next.data); // Fourth Node: 400
        System.out.println("Last Node Next: " + first.next.next.next.next.data); // ERROR: Exception in thread "main"
                                                                                 // java.lang.NullPointerException:
                                                                                 // Cannot read field "data" because
                                                                                 // "<local1>.next.next.next.next" is
                                                                                 // null

    }
}
