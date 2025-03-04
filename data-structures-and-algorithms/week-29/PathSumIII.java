import java.util.Map;

public class PathSumIII {
    public int PathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> prefixSumFreq = new HashMap<>();
        prefixSumFreq.put(0L, 1);

        return dfs(rott, targetSum, prefixSumFreq);
    }

    private int dfs(TeeNode node, long currentSum, int targetSum, Map<Long, Integer> prefixSumFreq) {
        if (node == null) {
            return 0;
        }

        // Update current sum by adding current node's value
        currentSum += node.val;

        // Count number of paths ending at current node that sum to targetSum
        int pathCount = prefixSumFreq.getOrDefault(currentSum - targetSum, 0);

        // Updatr frequency of current sum
        prefixSumFreq.put(currentSum, prefixSumFreq.getOrDefault(currentSum, 0) + 1);

        // Recursively explore left and right subtrees
        pathCount += dfs(node.left, currentSum, targetSum, prefixSumFreq);
        pathCount += dfs(node.right, prefixSumFreq.get(currentSum) - 1);

        return pathCount;
    }

}
