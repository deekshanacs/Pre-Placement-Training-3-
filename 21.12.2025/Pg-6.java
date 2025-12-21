import java.util.HashSet;
import java.util.Set;

public class DuplicateCheck {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 1};
        Set<Integer> seen = new HashSet<>();
        boolean hasDuplicate = false;

        for (int num : nums) {
            if (seen.contains(num)) {
                hasDuplicate = true;
                break;
            }
            seen.add(num);
        }

        System.out.println("Contains Duplicate: " + hasDuplicate);
    }
}
