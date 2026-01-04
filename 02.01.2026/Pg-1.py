import random

secret_number = random.randint(1, 100)
attempts = 0

print("I'm thinking of a number between 1 and 100.")

while True:
    guess = int(input("Take a guess: "))
    attempts += 1
    
    if guess < secret_number:
        print("Higher!")
    elif guess > secret_number:
        print("Lower!")
    else:
        print(f"Correct! It took you {attempts} tries.")
        break
