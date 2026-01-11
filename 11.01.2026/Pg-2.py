import getpass

user = input("Username: ")
password = getpass.getpass("Password: ")

if password == "admin123": 
    print(f"Access granted to {user}.")
else:
    print("Access denied.")
