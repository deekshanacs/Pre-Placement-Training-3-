import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        String content = Files.readString(filePath);
        System.out.println("File Content: " + content);
    }
}
