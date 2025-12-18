public class StringScenario {
    public static void main(String[] args) {
        String report = "";
        for (int i = 0; i < 10000; i++) {
            report += "Line " + i + "\n"; 
        }
        StringBuilder betterReport = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            betterReport.append("Line ").append(i).append("\n");
        }
        System.out.println("Report generated efficiently.");
    }
}
