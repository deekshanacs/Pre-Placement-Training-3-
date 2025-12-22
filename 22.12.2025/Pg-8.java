import java.util.*;

public class PriceAnalyzer {
    public static void main(String[] args) {
        List<Double> cartPrices = Arrays.asList(12.99, 45.50, 8.99, 105.00, 23.40);

        Double maxPrice = Collections.max(cartPrices);
        int index = cartPrices.indexOf(maxPrice);

        System.out.println("Most expensive item costs: $" + maxPrice);
        System.out.println("It is item number " + (index + 1) + " in the cart.");
    }
}
