import asyncio
import aiohttp
import time

async def fetch_status(session, url):
    """Asynchronously send a GET request and return the status code."""
    try:
        async with session.get(url, timeout=10) as response:
            return f"URL: {url} | Status: {response.status}"
    except Exception as e:
        return f"URL: {url} | Error: {str(e)}"

async def main():
    urls = [
        "https://www.google.com",
        "https://www.github.com",
        "https://www.python.org",
        "https://www.reddit.com",
        "https://www.stackoverflow.com"
    ]

    async with aiohttp.ClientSession() as session:
        tasks = [fetch_status(session, url) for url in urls]

        results = await asyncio.gather(*tasks)
        
        for result in results:
            print(result)

if __name__ == "__main__":
    start_time = time.perf_counter()
    asyncio.run(main())
    end_time = time.perf_counter()
    print(f"\nFinished in {end_time - start_time:.2f} seconds.")
