public class ATM {
    public static void main(String[] args) {
        double balance = 500.00;
        String request = "600"; 
        try {
            double amount = Double.parseDouble(request);
            if (amount > balance) throw new ArithmeticException("Insufficient Funds");
            balance -= amount;
            System.out.println("Remaining Balance: $" + balance);
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        }
    }
}
