int attempts = 0;
int maxRetries = 5;
long waitTime = 1000;

while (attempts < maxRetries) {
    if (connectToApi()) {
        break; 
    } else {
        attempts++;
        if (attempts == maxRetries) throw new RuntimeException("Service Down");
        
        Thread.sleep(waitTime);
        waitTime *= 2; 
    }
}
