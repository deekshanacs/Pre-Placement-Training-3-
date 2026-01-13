class SingletonMeta(type):
    """
    A thread-safe implementation of a Singleton Metaclass.
    """
    _instances = {}

    def __call__(cls, *args, **kwargs):
        if cls not in cls._instances:
            instance = super().__call__(*args, **kwargs)
            cls._instances[cls] = instance
        return cls._instances[cls]

class DatabaseConnection(metaclass=SingletonMeta):
    def __init__(self):
        self.connection_id = "DB_12345"
        print(f"Initializing Database Connection: {self.connection_id}")
if __name__ == "__main__":
    db1 = DatabaseConnection()
    db2 = DatabaseConnection()

    print(f"Database 1 ID: {id(db1)}")
    print(f"Database 2 ID: {id(db2)}")

    if db1 is db2:
        print("\nSuccess: Both variables point to the same instance.")
    else:
        print("\nFailure: Instances are different.")
