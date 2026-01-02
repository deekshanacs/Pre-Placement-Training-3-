import functools

def count_calls(func):
    @functools.wraps(func)
    def wrapper(*args, **kwargs):
        wrapper.calls += 1
        print(f"Call {wrapper.calls} of {func.__name__!r}")
        return func(*args, **kwargs)
    wrapper.calls = 0
    return wrapper

@count_calls
def say_hello():
    print("Hello!")

say_hello()
say_hello()
