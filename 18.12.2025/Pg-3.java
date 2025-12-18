public class ExceptionScenario {
    public int divide(int a, int b) {
        return a / b; 
    }
    public void readFile() throws Exception {
        throw new Exception("File missing!");
    }

    public static void main(String[] args) {
        ExceptionScenario obj = new ExceptionScenario();
        try {
            obj.readFile();
        } catch (Exception e) {
            System.out.println("Handled a checked exception.");
        }
        obj.divide(10, 0); 
    }
}
