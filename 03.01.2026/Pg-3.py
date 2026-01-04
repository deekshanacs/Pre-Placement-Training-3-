import random

score = 0
for i in range(5):
    num1 = random.randint(1, 10)
    num2 = random.randint(1, 10)
    ans = int(input(f"What is {num1} + {num2}? "))
    
    if ans == num1 + num2:
        print("Correct!")
        score += 1
    else:
        print(f"Wrong! It was {num1 + num2}")

print(f"Final Score: {score}/5")
