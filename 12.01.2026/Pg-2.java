import java.util.Scanner;

class Stack {
    int top = -1, size;
    int[] arr;

    Stack(int size) {
        this.size = size;
        arr = new int[size];
    }

    void push(int val) {
        if (top == size - 1) System.out.println("Stack Overflow!");
        else arr[++top] = val;
    }

    void pop() {
        if (top == -1) System.out.println("Stack Underflow!");
        else System.out.println("Popped: " + arr[top--]);
    }
}

public class StackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Stack Size: ");
        Stack s = new Stack(sc.nextInt());

        while (true) {
            System.out.print("\n1.Push 2.Pop 3.Exit: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter value: ");
                s.push(sc.nextInt());
            } else if (choice == 2) s.pop();
            else break;
        }
    }
}
