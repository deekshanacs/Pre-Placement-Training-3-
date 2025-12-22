import java.util.*;

public class RegistrationCheck {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList("a@test.com", "b@test.com", "a@test.com");
        Set<String> uniqueEmails = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String email : emails) {
            if (!uniqueEmails.add(email)) {
                duplicates.add(email);
            }
        }
        System.out.println("Duplicate registrations found: " + duplicates);
    }
}
