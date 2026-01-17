class Integer:
    def __set_name__(self, owner, name):
        self.name = name

    def __set__(self, instance, value):
        if not isinstance(value, int):
            raise TypeError(f"'{self.name}' must be an integer")
        instance.__dict__[self.name] = value

class User:
    age = Integer()  
    
    def __init__(self, age):
        self.age = age

u = User(25)
print(f"User age: {u.age}")
