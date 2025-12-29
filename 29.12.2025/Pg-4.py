import time

class Timer:
    def __enter__(self):
        self.start = time.time()
        return self 

    def __exit__(self, exc_type, exc_val, exc_tb):
        print(f"Time taken: {time.time() - self.start:.5f} seconds")

with Timer() as t:
    sum(range(1_000_000)) 
