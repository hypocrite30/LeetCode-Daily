import java.util.*;

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

public class Solution {

    /** DFS */
    /*public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;
        if (root.val > high) return rangeSumBST(root.left, low, high);
        if (root.val < low) return rangeSumBST(root.right, low, high);
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST( root.right, low, high);
    }*/

    /** BFS */
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        Deque<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) continue;
            if (node.val > high) {
                queue.offer(node.left);
            } else if (node.val < low) {
                queue.offer(node.right);
            } else {
                sum += node.val;
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }
        return sum;
    }
}

