def smart_home_console():
    print("--- Welcome to Python Smart Home OS ---")
    print("Commands: [light <room> <on/off>], [temp <val>], [lock all], [status], [quit]")
    
    while True:
        command = input("\nHome-Hub > ").lower().split()

        match command:
  
            case ["quit"] | ["exit"]:
                print("Shutting down systems. Goodbye.")
                break

            case ["status"]:
                print("System Health: 100% | All devices connected.")

            case ["light", room, state] if state in ["on", "off"]:
                print(f"Switching {room} lights to {state.upper()}.")


            case ["temp", val]:
                try:
                    temp = int(val)
                    if 15 <= temp <= 30:
                        print(f"Setting thermostat to {temp}°C.")
                    else:
                        print("Warning: Temperature outside safe range (15-30).")
                except ValueError:
                    print("Error: Temperature must be a number.")

            case ["lock", "all"]:
                print("Securing all entry points... Locked.")

            case ["music", "play" | "pause" | "stop"]:
                action = command[1]
                print(f"Music player set to: {action}")


            case ["schedule", hour, "action", task]:
                print(f"Task Scheduled: Will {task} at {hour}:00.")

            case _:
                print(f"Command not recognized: '{' '.join(command)}'")
                print("Try: 'light kitchen on' or 'temp 22'")

if __name__ == "__main__":
    smart_home_console()
