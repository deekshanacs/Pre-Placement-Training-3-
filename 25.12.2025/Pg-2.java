public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " is: " + fact(number));
    }
  
    static int fact(int n) {
        return (n <= 1) ? 1 : n * fact(n - 1);
    }
}
