import argparse

parser = argparse.ArgumentParser(description="A simple CLI tool")
parser.add_argument("--name", type=str, help="Your name", required=True)
parser.add_argument("--count", type=int, default=1, help="Number of repeats")

args = parser.parse_args()
for _ in range(args.count):
    print(f"Hello, {args.name}!")
