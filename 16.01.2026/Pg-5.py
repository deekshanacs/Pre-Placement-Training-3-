principal = float(input("Enter the starting amount: "))
rate = float(input("Enter the annual interest rate (in %): "))
time = float(input("Enter the time in years: "))

interest = (principal * rate * time) / 100

print(f"\nThe simple interest earned is: ${interest:,.2f}")
print(f"Total value: ${principal + interest:,.2f}")
