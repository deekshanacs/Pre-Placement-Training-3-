word = "python"
guessed_letters = ""
turns = 6

while turns > 0:
    failed = 0
    for char in word:
        if char in guessed_letters:
            print(char, end=" ")
        else:
            print("_", end=" ")
            failed += 1
            
    if failed == 0:
        print("\nYou won!")
        break
        
    guess = input("\nGuess a letter: ")
    guessed_letters += guess
    
    if guess not in word:
        turns -= 1
        print(f"Wrong! Turns left: {turns}")
