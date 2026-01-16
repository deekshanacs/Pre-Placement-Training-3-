weight = float(input("Enter your weight in kg: "))
height = float(input("Enter your height in meters (e.g., 1.75): "))

bmi = weight / (height ** 2)

print(f"\nYour BMI is: {bmi:.2f}")

if bmi < 18.5:
    print("Category: Underweight")
elif 18.5 <= bmi < 25:
    print("Category: Normal weight")
else:
    print("Category: Overweight")
