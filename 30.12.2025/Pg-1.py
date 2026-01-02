import asyncio
import aiohttp

async def fetch_url(session, url):
    async with session.get(url) as response:
        status = response.status
        print(f"URL: {url} | Status: {status}")
        return await response.text()

async def main(urls):
    async with aiohttp.ClientSession() as session:
        tasks = [fetch_url(session, url) for url in urls]
        await asyncio.gather(*tasks)

urls = ["https://google.com", "https://python.org", "https://github.com"]
asyncio.run(main(urls))
