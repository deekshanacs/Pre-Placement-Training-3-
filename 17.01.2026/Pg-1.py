import asyncio, aiohttp

async def fetch_status(session, url):
    async with session.get(url) as response:
        return response.status

async def main():
    urls = ["https://python.org", "https://google.com", "https://github.com"]
    async with aiohttp.ClientSession() as session:
        tasks = [fetch_status(session, url) for url in urls]
        results = await asyncio.gather(*tasks)
        print(f"Status codes: {results}")

if __name__ == "__main__":
    asyncio.run(main())
