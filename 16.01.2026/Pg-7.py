print("Enter your marks for 3 subjects:")
m1 = float(input("Subject 1: "))
m2 = float(input("Subject 2: "))
m3 = float(input("Subject 3: "))

average = (m1 + m2 + m3) / 3

print(f"\nYour average score is: {average:.1f}")
if average >= 50:
    print("Status: Passed")
else:
    print("Status: Failed")
