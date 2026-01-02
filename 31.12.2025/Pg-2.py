from scapy.all import sniff

def packet_callback(packet):
    if packet.haslayer("IP"):
        ip_src = packet["IP"].src
        ip_dst = packet["IP"].dst
        print(f"IP Packet: {ip_src} -> {ip_dst}")
