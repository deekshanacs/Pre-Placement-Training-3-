import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> printerQueue = new LinkedList<>();
        printerQueue.add("Document1.pdf");
        printerQueue.add("Photo.jpg");
        printerQueue.add("Resume.docx");

        System.out.println("Printing (Polling): " + printerQueue.poll());
        System.out.println("Next in line (Peeking): " + printerQueue.peek());
        System.out.println("Remaining Queue: " + printerQueue);
    }
}
