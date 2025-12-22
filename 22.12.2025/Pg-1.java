import java.util.*;

public class InventorySystem {
    public static void main(String[] args) {
        Map<String, String> inventory = new HashMap<>();
        inventory.put("Laptop", "Aisle 3");
        inventory.put("Mouse", "Aisle 1");
        inventory.put("Keyboard", "Aisle 2");

        String searchItem = "Mouse";
        if (inventory.containsKey(searchItem)) {
            System.out.println(searchItem + " found at: " + inventory.get(searchItem));
        } else {
            System.out.println("Item not in stock.");
        }
    }
}
