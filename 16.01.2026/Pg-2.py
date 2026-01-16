bill = float(input("What is the total bill amount? $"))
tip_percent = int(input("What percentage tip would you like to give (e.g., 15, 20)? "))

tip_amount = bill * (tip_percent / 100)
total = bill + tip_amount

print(f"Tip amount: ${tip_amount:.2f}")
print(f"Total bill: ${total:.2f}")
