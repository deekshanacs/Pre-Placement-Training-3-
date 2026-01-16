import time

seconds = int(input("How many seconds to count down? "))

print("\nStarting...")
for i in range(seconds, 0, -1):
    print(i)
    time.sleep(1) 

print("⏰ Time's up!")
