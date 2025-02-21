package data-structures-and-algorithms.week-29;

public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;

        } 

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        int currentDepth = 1 + Math.max(leftDepth, rightDepth);

        return currentDepth;
    }

}
