import sqlite3

class Database:
    def __init__(self, db_name):
        self.conn = sqlite3.connect(db_name)
        self.cursor = self.conn.cursor()

    def create_table(self):
        self.cursor.execute("CREATE TABLE IF NOT EXISTS users (id INTEGER PRIMARY KEY, name TEXT)")
        self.conn.commit()

    def insert_user(self, name):
        self.cursor.execute("INSERT INTO users (name) VALUES (?)", (name,))
        self.conn.commit()

    def fetch_users(self):
        return self.cursor.execute("SELECT * FROM users").fetchall()

db = Database("app.db")
db.create_table()
db.insert_user("Deekshana")
print(db.fetch_users())
