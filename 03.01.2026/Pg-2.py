import random

answers = ["Yes, definitely", "Ask again later", "No way", "Maybe", "Outlook good"]
input("Ask the Magic 8-Ball a question: ")

print("Thinking...")
print(f"The Ball says: {random.choice(answers)}")
