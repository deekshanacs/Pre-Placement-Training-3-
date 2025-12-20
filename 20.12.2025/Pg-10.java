long lastExecutionTime = 0;
long delay = 500; 
while (appIsRunning) {
    if (userClicked) {
        long currentTime = System.currentTimeMillis();
        
        if (currentTime - lastExecutionTime > delay) {
            saveData();
            lastExecutionTime = currentTime;
        } else {
            System.out.println("Ignored: Too frequent");
        }
    }
}
