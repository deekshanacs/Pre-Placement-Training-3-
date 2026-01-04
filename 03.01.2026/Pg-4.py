treasure_x, treasure_y = 2, 3

print("--- Treasure Map (3x3 Grid) ---")
user_x = int(input("Enter X (1-3): "))
user_y = int(input("Enter Y (1-3): "))

if user_x == treasure_x and user_y == treasure_y:
    print("💰 You found the gold!")
else:
    print("❌ Just dirt here.")
