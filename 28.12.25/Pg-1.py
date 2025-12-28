class BankAccount:
    def __init__(self, owner, balance=0):
        self.owner = owner
        self.balance = balance
        self.transactions = [] 

    def deposit(self, amount):
        self.balance += amount
        self.transactions.append(f"Deposited: +${amount}")
        print(f"Deposited ${amount}. New Balance: ${self.balance}")

    def withdraw(self, amount):
        if amount > self.balance:
            print(f"Declined: Insufficient funds to withdraw ${amount}")
        else:
            self.balance -= amount
            self.transactions.append(f"Withdrew: -${amount}")
            print(f"Withdrew ${amount}. New Balance: ${self.balance}")

    def print_statement(self):
        print(f"\n--- Statement for {self.owner} ---")
        for t in self.transactions:
            print(t)
        print(f"Ending Balance: ${self.balance}\n")
my_account = BankAccount("Alice", 100)
my_account.deposit(50)
my_account.withdraw(200) 
my_account.withdraw(30)
my_account.print_statement()
