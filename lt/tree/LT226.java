package lt.tree;


import lt.struct.TreeNode;

/**
 * @author: Justin Huang
 * @description:
 * @date: 2024/10/30 16:35
 */
public class LT226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        swapLeftAndRight(root);
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    private void swapLeftAndRight(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
    }
}
