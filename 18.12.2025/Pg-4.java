import java.util.*;

public class ListFix {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>(Arrays.asList(90, 30, 50, 20));
        scores.removeIf(score -> score < 40);
        
        System.out.println(scores); // [90, 50]
    }
}
