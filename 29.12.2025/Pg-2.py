class DynamicData:
    def __init__(self, **kwargs):
        self._data = kwargs
    
    def __getattr__(self, name):
        return self._data.get(name, f"Field '{name}' is missing")

    def __setattr__(self, name, value):
        if name == "_data": super().__setattr__(name, value)
        else: self._data[name] = value

config = DynamicData(host="127.0.0.1", port=8080)
config.debug = True
print(f"Host: {config.host} | DB: {config.database}") 
