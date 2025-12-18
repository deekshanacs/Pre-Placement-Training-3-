import java.util.*;

record Product(String name, double price) {}

public class SortScenario {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 1000), new Product("Mouse", 20), new Product("Bag", 20)
        );

        products.sort(Comparator.comparing(Product::price).thenComparing(Product::name));
        System.out.println(products);
    }
}
