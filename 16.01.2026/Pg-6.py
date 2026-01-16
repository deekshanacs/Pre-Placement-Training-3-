shopping_list = []

while True:
    item = input("Add an item (or type 'done' to finish): ")
    if item.lower() == 'done':
        break
    shopping_list.append(item)

print("\n--- Your Shopping List ---")
for item in shopping_list:
    print(f"- {item}")
