def infinite_sequence():
    num = 0
    while True: yield num; num += 1

def squared(seq):
    for i in seq: yield i * i
gen = squared(infinite_sequence())

for _ in range(5):
    print(next(gen)) 
