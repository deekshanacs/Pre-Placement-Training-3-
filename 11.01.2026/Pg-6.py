import socket
from threading import Thread

def scan_port(host, port):
    s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    s.settimeout(0.5)
    if s.connect_ex((host, port)) == 0:
        print(f"[!] Port {port} is OPEN")
    s.close()

target = "scanme.nmap.org"
print(f"Scanning {target}...")
for port in range(1, 1025):
    thread = Thread(target=scan_port, args=(target, port))
    thread.start()
