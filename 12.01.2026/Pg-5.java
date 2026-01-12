import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> students = new HashMap<>();

        System.out.print("How many students to add? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();
            System.out.print("Enter Name: ");
            String name = sc.next();
            students.put(roll, name);
        }

        System.out.println("\n--- Student Records ---");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
