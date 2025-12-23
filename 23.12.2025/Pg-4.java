import java.io.File;

public class DiskOrganizer {

    public static void sortFilesBySize(File[] files) {
        if (files == null || files.length == 0) return;

        int n = files.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (files[j].length() > files[j + 1].length()) {
                    File temp = files[j];
                    files[j] = files[j + 1];
                    files[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        File[] myFiles = {
            new File("config.xml"),
            new File("video.mp4"),  
            new File("note.txt")    
        };
        
        sortFilesBySize(myFiles);
        
        for (File f : myFiles) {
            System.out.println(f.getName() + " : " + f.length() + " bytes");
        }
    }
}
