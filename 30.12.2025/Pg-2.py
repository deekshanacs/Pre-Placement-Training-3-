class ModelMeta(type):
    def __new__(cls, name, bases, attrs):
        if "id" not in attrs:
            raise TypeError(f"Class {name} must have an 'id' field.")
        return super().__new__(cls, name, bases, attrs)

class User(metaclass=ModelMeta):
    id = 1 
    name = "Alice"
