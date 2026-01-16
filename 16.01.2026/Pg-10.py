
stored_username = "admin"
stored_password = "password123"

print("--- System Login ---")
username = input("Username: ")
password = input("Password: ")

if username == stored_username and password == stored_password:
    print("\n✅ Access Granted. Welcome back!")
else:
    print("\n❌ Access Denied. Incorrect username or password.")
