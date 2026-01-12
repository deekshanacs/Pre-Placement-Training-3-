import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; this.next = null; }
}

public class LinkedListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null, temp = null;
        
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value for node " + (i + 1) + ": ");
            int val = sc.nextInt();
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                temp = head;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
        }
        
        System.out.print("Linked List: ");
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
