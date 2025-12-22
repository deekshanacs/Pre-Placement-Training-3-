import java.util.*;

public class LotteryGen {
    public static void main(String[] args) {
        Random rand = new Random();
        Set<Integer> winningNumbers = new HashSet<>();

        while (winningNumbers.size() < 3) {
            winningNumbers.add(rand.nextInt(50) + 1); 
        }

        System.out.println("Winning Numbers: " + winningNumbers);
    }
}
