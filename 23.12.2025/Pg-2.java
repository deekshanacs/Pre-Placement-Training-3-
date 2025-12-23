import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class LogEntry {
    String message;
    LocalDateTime timestamp;

    public LogEntry(String msg, LocalDateTime time) {
        this.message = msg;
        this.timestamp = time;
    }
    
    @Override
    public String toString() { return timestamp + ": " + message; }
}

public class LogStreamFixer {

    public static void adaptiveBubbleSort(List<LogEntry> logs) {
        int n = logs.size();
        boolean isSorted;

        for (int i = 0; i < n - 1; i++) {
            isSorted = true;
            
            for (int j = 0; j < n - 1 - i; j++) {
                if (logs.get(j).timestamp.isAfter(logs.get(j + 1).timestamp)) {
                    LogEntry temp = logs.get(j);
                    logs.set(j, logs.get(j + 1));
                    logs.set(j + 1, temp);
                    
                    isSorted = false; 
                }
            }
            if (isSorted) {
                System.out.println("Logs aligned. Terminating sort at pass: " + (i + 1));
                break;
            }
        }
    }
}
