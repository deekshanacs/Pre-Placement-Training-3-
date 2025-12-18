import java.util.Optional;

class User { Address address; }
class Address { String city; }

public class OptionalUsage {
    public void printCity(User user) {
        String city = Optional.ofNullable(user)
                .map(u -> u.address)
                .map(a -> a.city)
                .orElse("Unknown City");
        System.out.println(city);
    }
}
