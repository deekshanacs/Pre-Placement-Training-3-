public class DatabaseManager {
    private DatabaseManager() {}

    private static class Holder {
        private static final DatabaseManager INSTANCE = new DatabaseManager();
    }

    public static DatabaseManager getInstance() {
        return Holder.INSTANCE;
    }
}
