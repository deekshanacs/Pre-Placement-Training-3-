import java.io.IOException;

class Database {
    public Database() throws IOException {
        double chance = Math.random();
        if (chance < 0.5) {
            throw new IOException("Connection Failed at Parent Level");
        }
        System.out.println("Parent DB Connected.");
    }
}

class UserDB extends Database {
    public UserDB() throws IOException {
        super(); 
        System.out.println("Child UserDB initialized.");
    }
}

public class App {
    public static void main(String[] args) {
        try {
    
            UserDB user = new UserDB();
            System.out.println("Success!");
        } catch (IOException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
