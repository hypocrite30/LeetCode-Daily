import java.util.*;

/* 700. Search in a Binary Search Tree */
public class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        return DFS(root, val);
    }

    private TreeNode DFS(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;
        else if (root.val < val) return DFS(root.right, val);
        else return DFS(root.left, val);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}