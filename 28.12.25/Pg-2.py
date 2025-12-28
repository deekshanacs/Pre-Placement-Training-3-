inventory = {
    "Laptop": 15,
    "Mouse": 4,
    "Keyboard": 12,
    "Monitor": 2
}

def check_stock():
    item = input("Enter item name to check: ")
    quantity = inventory.get(item)
    
    if quantity is None:
        print(f"Error: '{item}' is not found in the inventory system.")
    else:
        print(f"Item: {item} | Quantity: {quantity}")
        
        if quantity < 5:
            print(">>> ALERT: Low Stock! Reorder immediately.")
        else:
            print("Stock level is healthy.")
