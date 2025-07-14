// A Node class is provided for you in the editor. A Node object has an integer data field, data , and a Node instance pointer, next , pointing to another node (i.e.: the next node in a list).

// A removeDuplicates function is declared in your editor, which takes a pointer to the head node of a linked list as a parameter. Complete removeDuplicates so that it deletes any duplicate nodes from the list and returns the head of the updated list.

import java.util.Scanner;

class Node {
    int data;
    Node next;
    
    Node(int d) {
        data = d;
        next = null;
    }
}

public class Day24 {

    // Function to remove duplicates from sorted linked list
    public static Node removeDuplicates(Node head) {
        Node current = head;
        
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next; // skip duplicate
            } else {
                current = current.next;
            }
        }
        
        return head;
    }

    // Helper to print the list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // Main method to read input and execute logic
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  // Number of nodes
        if (n == 0) {
            System.out.println();
            sc.close();
            return;
        }

        Node head = new Node(sc.nextInt()); // first node
        Node current = head;

        for (int i = 1; i < n; i++) {
            int data = sc.nextInt();
            current.next = new Node(data);
            current = current.next;
        }

        head = removeDuplicates(head);
        printList(head);
        
        sc.close();
    }
}
