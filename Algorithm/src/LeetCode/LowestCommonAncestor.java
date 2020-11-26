package LeetCode;

/**
 * 二叉树的最近公共祖先 236
 */
public class LowestCommonAncestor {

    /**
     *
     * 三种情况  ①p q 都在 ② 都不在 ③只有一个在
     *
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        // 去左右子树中查找
       TreeNode left = lowestCommonAncestor(root.left, p, q);
       TreeNode right = lowestCommonAncestor(root.right, p, q);
       if (left != null && right != null) return root;
       // 这种情况包含right不为null跟null
       return (left != null) ? left : right;
    }
}
