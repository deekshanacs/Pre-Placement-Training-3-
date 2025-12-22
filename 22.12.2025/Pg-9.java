public class CSVParser {
    public static void main(String[] args) {
        String csvLine = "John Doe,30,New York,Engineer";
        String[] data = csvLine.split(",");

        if (data.length >= 3) {
            System.out.println("Name: " + data[0]);
            System.out.println("Location: " + data[2]);
        } else {
            System.out.println("Invalid data format.");
        }
    }
}
