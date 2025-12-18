import java.util.concurrent.Semaphore;

public class ApiLimiter {
    private final Semaphore semaphore = new Semaphore(3);

    public void callApi() {
        try {
            semaphore.acquire();
            System.out.println("Accessing API...");
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}
