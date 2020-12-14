package LeetCode.Tree;

/**
 *
 * 给定一个二叉树，原地将它展开为一个单链表。
 *
 *     1
 *    / \
 *   2   5
 *  / \   \
 * 3   4   6
 *
 *
 * 1
 *  \
 *   2
 *    \
 *     3
 *      \
 *       4
 *        \
 *         5
 *          \
 *           6
 *
 */
public class Flatten {

    /**
     *
     * 前序遍历
     *
     * @param root
     */
    public void flatten(TreeNode root) {
//        if (root == null) return;
//        TreeNode oldRight = root.right;
//        root.right = root.left;
//        root.left = null;
//        // 把右节点嫁接到左子树的最有节点的右节点
//        TreeNode rightMost = root;
//        while (rightMost.right != null) {
//            rightMost = rightMost.right;
//        }
//        rightMost.right = oldRight;
//        flatten(root.right);

        while (root != null) {
            // 左子树为空直接遍历右边的节点
            if (root.left != null) {
                TreeNode oldRight = root.right;
                root.right = root.left;
                root.left = null;
                // 把原来的右节点嫁接到原来左子树的最右节点的右节点
                TreeNode rightMost = root;
                while (rightMost.right != null) {
                    rightMost = rightMost.right;
                }
                rightMost.right = oldRight;
                //
                root = root.right;
            }
        }
    }

    private TreeNode prev;
    public void flatten1(TreeNode root) {
        if (root == null) return;
        flatten1(root.right);
        flatten1(root.left);
        if (prev != null) {
            root.right = prev;
            root.left = null;
        }
        prev = root;
    }


}
