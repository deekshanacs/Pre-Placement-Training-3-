import java.util.Scanner;

public class QueueExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Queue capacity: ");
        int cap = sc.nextInt();
        int[] queue = new int[cap];
        int front = 0, rear = 0;

        while (true) {
            System.out.print("\n1.Enqueue 2.Dequeue 3.Exit: ");
            int op = sc.nextInt();
            if (op == 1) {
                if (rear == cap) System.out.println("Queue Full!");
                else {
                    System.out.print("Enter value: ");
                    queue[rear++] = sc.nextInt();
                }
            } else if (op == 2) {
                if (front == rear) System.out.println("Queue Empty!");
                else System.out.println("Removed: " + queue[front++]);
            } else break;
        }
    }
}
