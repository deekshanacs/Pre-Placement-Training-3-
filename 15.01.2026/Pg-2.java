import java.util.*;
import java.util.function.Predicate;

class Validator<T> {
    private final T value;
    private final List<String> errors = new ArrayList<>();

    private Validator(T value) {
        this.value = value;
    }

    public static <T> Validator<T> of(T value) {
        return new Validator<>(value);
    }

    public Validator<T> validate(Predicate<T> condition, String errorMessage) {
        if (!condition.test(value)) {
            errors.add(errorMessage);
        }
        return this;
    }

    public void getResult() {
        if (errors.isEmpty()) {
            System.out.println("Validation Passed for: " + value);
        } else {
            System.err.println("Validation Failed: " + errors);
        }
    }
}

public class GenericDemo {
    public static void main(String[] args) {
        Validator.of("HelloJava")
            .validate(s -> s.length() > 5, "Length must be > 5")
            .validate(s -> s.contains("a"), "Must contain letter 'a'")
            .getResult();
        Validator.of(15)
            .validate(n -> n % 2 != 0, "Must be an odd number")
            .validate(n -> n < 10, "Must be less than 10")
            .getResult();
    }
}
