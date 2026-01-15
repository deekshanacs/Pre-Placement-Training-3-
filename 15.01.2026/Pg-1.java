import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class CustomThreadPool {
    private final BlockingQueue<Runnable> taskQueue;
    private final Thread[] workers;

    public CustomThreadPool(int threadCount) {
        taskQueue = new LinkedBlockingQueue<>();
        workers = new Thread[threadCount];

        for (int i = 0; i < threadCount; i++) {
            workers[i] = new Worker("Worker-" + i);
            workers[i].start();
        }
    }

    public void execute(Runnable task) {
        synchronized (taskQueue) {
            taskQueue.add(task);
            taskQueue.notify();
        }
    }

    private class Worker extends Thread {
        public Worker(String name) { super(name); }
        public void run() {
            Runnable task;
            while (true) {
                synchronized (taskQueue) {
                    while (taskQueue.isEmpty()) {
                        try { taskQueue.wait(); } catch (InterruptedException e) { return; }
                    }
                    task = taskQueue.poll();
                }
                try {
                    System.out.println(getName() + " executing task...");
                    task.run();
                } catch (RuntimeException e) {
                    System.out.println("Thread encountered an error: " + e.getMessage());
                }
            }
        }
    }
}

public class ThreadPoolDemo {
    public static void main(String[] args) {
        CustomThreadPool pool = new CustomThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            pool.execute(() -> {
                System.out.println("Processing Data Task #" + taskId);
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
            });
        }
    }
}
