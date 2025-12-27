import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        String content = "Hello! This is data written using Java NIO.";
        Path filePath = Path.of("java_test.txt");
        Files.writeString(filePath, content); 
        System.out.println("Successfully wrote to the file.");
    }
}
