package data-structures-and-algorithms.week-29;

public class ValidateBinarySearchTree {
    public boolean isValidBSTHelper(root, null, null);

    
}

private boolean isValidBSTHelper(TreeNode node, Integer low, Integer high) {
    if (node == null) {
        return true;
    }

    if (low != null && node.val <= low) {
        return false;
    }

    if (high != null && node.val >= high) {
        return false;
    }

    boolean isLeftBST = isValidBSTHelper(node.left, low, node.val);
    boolean isRightBST = isValidBSTHelper(node.right, node.val, high);
    return isLeftBST && isRightBST;
}
