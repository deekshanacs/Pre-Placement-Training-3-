class GameLevel {
    GameLevel() {
        System.out.println("1. Parent Constructor running...");
        loadAssets(); 
    }
    void loadAssets() { System.out.println("Parent assets loaded."); }
}

class BonusLevel extends GameLevel {
    private String levelName = "Underground Bunker"; 
    BonusLevel() {
        System.out.println("3. Child Constructor running...");
    }

    @Override
    void loadAssets() {

        System.out.println("2. Loading assets for: " + levelName.toUpperCase());
    }
}

public class GameLoader {
    public static void main(String[] args) {
        try {
            new BonusLevel();
        } catch (NullPointerException e) {
            System.out.println("CRASH: Variable was null during Parent Constructor!");
        }
    }
}
