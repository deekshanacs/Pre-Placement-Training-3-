def get_valid_int(prompt, min_val=0, max_val=100):
    while True:
        try:
            value = int(input(f"{prompt} ({min_val}-{max_val}): "))
            if min_val <= value <= max_val:
                return value
            print(f"Please stay between {min_val} and {max_val}.")
        except ValueError:
            print("Invalid input. Please enter a whole number.")

age = get_valid_int("Enter your age", 1, 120)
print(f"Verified age: {age}")
