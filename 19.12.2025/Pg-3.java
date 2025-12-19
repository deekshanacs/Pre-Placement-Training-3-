public class ServerStart {
    static int bootCount = 0;
    public ServerStart() {
        System.out.println("3. Constructor: Server Ready.");
    }
    static {
        System.out.println("1. Static Block: JVM Loaded Class.");
        bootCount = 10;
    }
    {
        System.out.println("2. Instance Block: Checking Ports...");
        bootCount++;
    }

    public static void main(String[] args) {
        System.out.println("--- Main Started ---");
        new ServerStart(); 
        System.out.println("--- Second Object ---");
        new ServerStart(); 
    }
}
