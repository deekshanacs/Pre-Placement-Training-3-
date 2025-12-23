import java.util.*;

public class InventorySorter {
    public static <T> void genericBubbleSort(List<T> items, Comparator<? super T> comparator) {
        int n = items.size();
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                T item1 = items.get(j);
                T item2 = items.get(j + 1);
                if (comparator.compare(item1, item2) > 0) {
                    items.set(j, item2);
                    items.set(j + 1, item1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        List<String> crates = Arrays.asList("Box-Z", "Box-A", "Box-M");
        genericBubbleSort(crates, (a, b) -> b.compareTo(a));
        
        System.out.println("Sorted Inventory: " + crates);
    }
}
