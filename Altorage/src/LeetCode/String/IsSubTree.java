package LeetCode.String;

/**
 * 判断一个树是不是另一个树的子树
 *
 * 思想： 把二叉树序列成字符串 判断是否包含子串
 *
 */
public class IsSubTree {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null || t == null) return false;
        return postOrderSerialize(s).contains(postOrderSerialize(t));
    }

    private String postOrderSerialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        postOrderSerialize(root, sb);
        return sb.toString().toLowerCase();
    }

    private void postOrderSerialize(TreeNode root, StringBuilder sb) {
    	// 左右子树为空使用#！标记
        if (root.left == null) {
            sb.append("#!");
        } else {
            postOrderSerialize(root.left, sb);
        }

        if (root.right == null) {
            sb.append("#!");
        } else {
            postOrderSerialize(root.right, sb);
        }
        // 一个结点值结束后用！标记
        sb.append(root.val).append("!");
    }

}
