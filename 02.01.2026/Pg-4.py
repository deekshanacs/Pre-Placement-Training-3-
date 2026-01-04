player_hp = 50
enemy_hp = 50

print("A wild Goblin appears!")

while player_hp > 0 and enemy_hp > 0:
    action = input("Type 'attack' or 'heal': ").lower()
    
    if action == "attack":
        enemy_hp -= 15
        print(f"You hit the Goblin! Goblin HP: {enemy_hp}")
    elif action == "heal":
        player_hp += 10
        print(f"You healed! Your HP: {player_hp}")
        
    # Enemy Turn
    player_hp -= 12
    print(f"The Goblin hits you! Your HP: {player_hp}")

if player_hp > 0:
    print("Victory!")
else:
    print("You died.")
