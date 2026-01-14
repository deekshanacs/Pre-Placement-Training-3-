class APIValidator(type):
    """Metaclass that enforces the presence of a 'connect' method."""
    def __init__(cls, name, bases, attr_dict):
        if name != "BaseAPI":
            if "connect" not in attr_dict:
                raise TypeError(f"Class '{name}' must implement a 'connect' method.")
        super().__init__(name, bases, attr_dict)

class BaseAPI(metaclass=APIValidator):
    """Base class for all APIs."""
    pass
class TwitterAPI(BaseAPI):
    def connect(self):
        print("Connecting to Twitter...")

if __name__ == "__main__":
    t = TwitterAPI()
    t.connect()
    print("TwitterAPI validated and instantiated successfully.")
