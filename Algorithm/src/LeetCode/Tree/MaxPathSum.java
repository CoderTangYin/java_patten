package LeetCode.Tree;

/**
 * 二叉树中的最大路径和
 */
public class MaxPathSum {


    public int maxPathSum(TreeNode root) {
        if (root == null) return 0;
        value(root);
        return sum;
    }

    private int sum = Integer.MIN_VALUE;
    /**
     * 计算某个节点提供给父类的最大路径
     *
     * 核心思想 利用后序遍历找它的left right节点可以提供给它的值
     * @param node
     * @return
     */
    private int value(TreeNode node) {
        if (node == null) return 0;
        // 计算左右节点
        int lv = Math.max(value(node.left), 0);
        int rv = Math.max(value(node.right),0);
        // 父节点跟自己的左右节点和的最大值比较
        sum = Math.max(node.val + lv + rv, sum);
        // 当前节点跟自己的子节点能够取到的最大值
        return node.val + Math.max(lv, rv);
    }
}
