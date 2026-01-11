import secrets
import string
import re

def generate_secure_password(length=16):
    alphabet = string.ascii_letters + string.digits + string.punctuation
    while True:
        password = ''.join(secrets.choice(alphabet) for _ in range(length))
        # Validate: at least one lowercase, one uppercase, and one digit
        if (any(c.islower() for c in password) and 
            any(c.isupper() for c in password) and 
            sum(c.isdigit() for c in password) >= 3):
            return password

print(f"Generated Password: {generate_secure_password()}")
