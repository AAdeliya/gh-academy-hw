public class ConstructBinaryTreefromPreorderandInorderTraversal {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (prorder == null || inorder == null || preorder.length == 0 || inorder.length == 0) {
            return null;
        }

        // Create HashMap to store inorder element indices for o(1) look up
        Map<Integer, Integer> inorderIndexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }

        // Call the helper method with initial full range of indices
        return buildTreeHelper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, inorderIndexMap);

    }

    private TreeNode buildTreeHelper(int[] preorder, int preStart, int preEnd,
            int[] inorder, int inStart, int inEnd,
            Map<Integer, Integer> inorderIndexMap) {
        // Base case if we've exhausted the valid index range

        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }

        int rootValue = preorder[preStart];
        TreeNode root = new TreeNode(rootValue);

        // Find the root's index in inorder traversal
        int rootIndexInorder = inorderIndexMap.get(rootValue);

        // Calculate the size of the left subtree
        int leftSubtreeSize = rootIndexInorder - inStart;

        // Recursively build left and right subtrees
        root.left = buildTree(preorder, preStart + leftSubtreeSize + 1, preEnd, inorder, rootIndexInorder + 1, inEnd,
                inorderIndexMap);

        return root;
    }
}
