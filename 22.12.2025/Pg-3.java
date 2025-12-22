public class PasswordCheck {
    public static void main(String[] args) {
        String password = "securePassword123";
        boolean hasUppercase = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
                break;
            }
        }
        
        System.out.println(hasUppercase ? "Password Valid" : "Add an uppercase letter");
    }
}
