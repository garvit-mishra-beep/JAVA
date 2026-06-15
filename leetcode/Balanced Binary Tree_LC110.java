class Solution {
     public int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = getHeight(node.left);
        int right = getHeight(node.right);
        return 1 + (left > right ? left : right);
    }
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int LF = getHeight(root.left);
        int RF = getHeight(root.right);
        int diff = LF - RF;
        if (diff < -1 || diff > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
   
}
