def memoize(func):
    cache = {} 
    def wrapper(*args):
        if args not in cache:
            cache[args] = func(*args)
        return cache[args]
    return wrapper

@memoize 
def fib(n): 
    return n if n < 2 else fib(n-1) + fib(n-2)

print(f"Fib(100): {fib(100)}")
