import java.util.PriorityQueue;

public class MinHeapDemo {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(1);

        System.out.println("Head of queue (Min element): " + pq.peek());

        System.out.print("Processing in order: ");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}
