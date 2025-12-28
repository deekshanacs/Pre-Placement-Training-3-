def calculate_coffee_bill(amount, has_membership):
    print(f"--- Generating Bill for Order: ${amount} ---")
    if amount > 50:
        discount = amount * 0.10
        amount -= discount
        print(f"Bulk discount applied: -${discount:.2f}")
    if has_membership:
        member_discount = amount * 0.05
        amount -= member_discount
        print(f"Membership discount applied: -${member_discount:.2f}")
        
    print(f"Final Total: ${amount:.2f}")
    print("-----------------------------------")

calculate_coffee_bill(40, False) # No discounts
calculate_coffee_bill(60, True)  # Both discounts
