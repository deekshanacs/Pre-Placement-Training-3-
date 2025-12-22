import java.util.*;
import java.util.stream.Collectors;

public class GradeFilter {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(45, 88, 92, 60, 78, 30);
        
        List<Integer> passingScores = scores.stream()
                                            .filter(s -> s > 75)
                                            .collect(Collectors.toList());
                                            
        System.out.println("Passing scores: " + passingScores);
        System.out.println("Total passed: " + passingScores.size());
    }
}
