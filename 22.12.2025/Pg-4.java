import java.util.*;

public class SupportQueue {
    public static void main(String[] args) {
        Queue<String> tickets = new LinkedList<>();
        tickets.add("Ticket #101: Login Issue");
        tickets.add("Ticket #102: Payment Fail");

        while (!tickets.isEmpty()) {
            System.out.println("Processing: " + tickets.poll());
            System.out.println("Tickets remaining: " + tickets.size());
        }
        System.out.println("All tickets resolved.");
    }
}
