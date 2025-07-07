// Complete the insert function in your editor so that it creates a new Node (pass  as the Node constructor argument) and inserts it at the tail of the linked list referenced by the  parameter. Once the new node is added, return the reference to the  node.


import java.util.*;

public class Day15 {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            return newNode;
        }

        // Traverse to the end of the list
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Append the new node
        current.next = newNode;
        return head;
    }

    public static void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node head = null;

        for (int i = 0; i < T; i++) {
            int data = sc.nextInt();
            head = insert(head, data);
        }

        display(head);
        sc.close();
    }
}
