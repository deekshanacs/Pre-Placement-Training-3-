import requests
from bs4 import BeautifulSoup

def scrape_headlines(url):
    try:
        response = requests.get(url, timeout=5)
        response.raise_for_status() 
        soup = BeautifulSoup(response.text, 'html.parser')
        headlines = soup.find_all(['h1', 'h2', 'h3'], limit=10)
        
        print(f"--- Top Headlines from {url} ---")
        for i, h in enumerate(headlines, 1):
            print(f"{i}. {h.get_text(strip=True)}")
            
    except requests.exceptions.RequestException as e:
        print(f"An error occurred: {e}")

scrape_headlines("https://news.ycombinator.com/")
