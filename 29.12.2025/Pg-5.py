def server_config(host="localhost", port=80, **extras):
    print(f"Host: {host}, Port: {port}, Extras: {extras}")

default_settings = {"port": 8080, "debug": True}
user_overrides = {"host": "192.168.1.1", "port": 9000}
final_config = default_settings | user_overrides
server_config(**final_config) 
