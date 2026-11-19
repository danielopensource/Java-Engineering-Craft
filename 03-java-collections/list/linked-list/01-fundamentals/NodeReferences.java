/**
 * NodeReferences
 */
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class NodeReferences {

    public static void main(String[] args) {

        Node a = new Node(100);
        Node b = a;

        b.data = 200;
        System.out.println("Node a: " + a.data); // Node a: 200
        System.out.println("Node b: " + b.data); // Node b: 200

        Node x = new Node(10);
        Node y = new Node(20);

        System.out.println("Node x Before reference reassignment: " + x.data); // Node x Before reference reassignment:
                                                                               // 10
        System.out.println("Node y Before reference reassignment: " + y.data); // Node y Before reference reassignment:
                                                                               // 20

        y = x;
        System.out.println("Value of Node y :" + y.data); // Value of Node y :10
        y = new Node(30);

        System.out.println("Node x After reference reassignment: " + x.data); // Node x After reference reassignment: 10
        System.out.println("Node y After reference reassignment: " + y.data); // Node y After reference reassignment: 30

        Node head = null;
       System.out.println(head.data); // ERROR: java.lang.NullPointerException

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        second = first;
        second.data = 100;

        second = third;
        System.out.println(first.data); // 100
        System.out.println(second.data); // 30
        System.out.println(third.data); // 30
    }
}