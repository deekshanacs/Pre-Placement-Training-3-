import requests

def get_trending_repos(language):
    url = f"https://api.github.com/search/repositories?q=language:{language}&sort=stars"
    response = requests.get(url).json()
    
    print(f"--- Top {language.capitalize()} Repos ---")
    for repo in response['items'][:5]:
        name = repo['name']
        stars = repo['stargazers_count']
        desc = repo['description'][:50] + "..."
        print(f"⭐ {stars} | {name}: {desc}")

get_trending_repos("python")
