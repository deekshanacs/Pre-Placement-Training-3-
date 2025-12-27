import java.io.File;

public class FileInfo {
    public static void main(String[] args) {
        File file = new File("java_test.txt");
        if (file.exists()) {
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Size in Bytes: " + file.length());
        } else {
            System.out.println("File does not exist.");
        }
    }
}
