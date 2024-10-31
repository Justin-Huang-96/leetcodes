package lt.tree;


import lt.struct.TreeNode;

import java.util.Stack;

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
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            swapLeftAndRight(node);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return root;
    }

    public TreeNode invertTree_Recursion(TreeNode root) {
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
