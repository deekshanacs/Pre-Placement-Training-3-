import random

balance = 100
print(f"You have ${balance}.")

while balance > 0:
    bet = int(input("How much do you want to bet? "))
    guess = input("Predict 'high' (4-6) or 'low' (1-3): ").lower()
    
    roll = random.randint(1, 6)
    print(f"The dice rolled: {roll}")
    
    result = "high" if roll >= 4 else "low"
    
    if guess == result:
        balance += bet
        print(f"Win! New balance: ${balance}")
    else:
        balance -= bet
        print(f"Loss! New balance: ${balance}")
