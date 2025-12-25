import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        System.out.print("Enter text: ");
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Reversed: " + reversed);
    }
}
