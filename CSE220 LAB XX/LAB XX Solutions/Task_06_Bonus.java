import java.util.ArrayList;
import java.util.List;

public class Task_06_Bonus {
    public static int countWays(int steps) {
        if (steps == 0) {
            return 1;
        }
        if (steps < 0) {
            return 0;
        }
        return countWays(steps - 1) + countWays(steps - 2) + countWays(steps - 3);
    }
    // All done here. 
    // Just testing my capability
    public static List<List<Integer>> countWaysWithSteps(int steps) {
        List<List<Integer>> result = new ArrayList<>();
        helper(steps, new ArrayList<>(), result);
        return result;
    }

    private static void helper(int n, List<Integer> path, List<List<Integer>> result) {
        if (n == 0) {
            result.add(new ArrayList<>(path));
            return;
        }
        if (n < 0) {
            return;
        }
        path.add(1);
        helper(n - 1, path, result);
        path.remove(path.size() - 1);
        
        path.add(2);
        helper(n - 2, path, result);
        path.remove(path.size() - 1);
        
        path.add(3);
        helper(n - 3, path, result);
        path.remove(path.size() - 1);
    }
}
