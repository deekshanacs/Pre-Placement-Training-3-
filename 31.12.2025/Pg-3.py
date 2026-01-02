class Service:
    def __init__(self, api_key):
        self.api_key = api_key

class Container:
    def __init__(self):
        self._services = {}

    def register(self, name, instance):
        self._services[name] = instance

    def get(self, name):
        return self._services.get(name)

container = Container()
container.register("google_api", Service(api_key="12345"))
print(container.get("google_api").api_key)
