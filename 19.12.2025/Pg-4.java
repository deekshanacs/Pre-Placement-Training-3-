import java.lang.reflect.Constructor;

class SecretVault {
    private SecretVault() {
        System.out.println("Security Alert: Vault Accessed!");
    }
}

public class Hacker {
    public static void main(String[] args) {
        try {

            System.out.println("Attempting to hack private constructor...");
            
            Constructor<SecretVault> hack = SecretVault.class.getDeclaredConstructor();
            hack.setAccessible(true); 
            SecretVault stolenObject = hack.newInstance();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
