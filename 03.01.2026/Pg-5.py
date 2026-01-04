correct_pw = "secret123"
attempts = 3

while attempts > 0:
    entry = input(f"Enter Admin Password ({attempts} tries left): ")
    if entry == correct_pw:
        print("ACCESS GRANTED. Downloading files...")
        break
    else:
        attempts -= 1
        print("ACCESS DENIED.")

if attempts == 0:
    print("SYSTEM LOCKED. Security notified.")
