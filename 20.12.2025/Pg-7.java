String nextPageToken = null;
do {
    Page result = api.fetchUsers(nextPageToken);
    process(result.getData());
    nextPageToken = result.getNextPageToken();
    
} while (nextPageToken != null);
