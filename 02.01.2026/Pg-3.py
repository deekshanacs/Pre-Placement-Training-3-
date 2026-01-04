print("You stand before a dark mansion. Do you enter through the 'door' or the 'window'?")
choice1 = input("> ").lower()

if choice1 == "door":
    print("The door creaks open. You see a 'hallway' and a 'staircase'.")
    choice2 = input("> ").lower()
    if choice2 == "hallway":
        print("You found the kitchen! You eat a ghost-sandwich and win.")
    else:
        print("A ghost pushes you down. Game Over.")
elif choice1 == "window":
    print("The glass breaks! You fall into a basement. Game Over.")
else:
    print("You ran away like a coward!")
