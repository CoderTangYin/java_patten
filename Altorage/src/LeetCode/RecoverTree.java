package LeetCode;

/**
 * 恢复二叉搜索树
 * 该树中的两个节点被错误地交换。请在不改变其结构的情况下，恢复这棵树。
 */
public class RecoverTree {
    // 临时保持上一个
    private TreeNode prev;
    // 存储错误较大的结点
    private TreeNode wrongMax;
    // 存储错误较小的结点
    private TreeNode wrongMin;

    /**
     * 利用中序遍历找逆序对 始终是判断前一个跟后一个的大小关系
     * 来确定逆序对
     * @param root
     */
    public void recoverTree(TreeNode root) {
        findWrongNode(root);
        // 交换结点
        int temp = wrongMax.val;
        wrongMax.val = wrongMin.val;
        wrongMin.val = temp;
    }

    /**
     * 第一种 交换的不是挨着的2个结点
     * [1, 2, [7, 4], 5, [6, 3], 8, 9]
     * 第一个逆序对是[7, 4] 第二个是[6, 3]
     *
     * 第二种 交换的是挨着的2个结点
     * 1, 2, [4, 3], 5, 6, 7, 8, 9]
     * 只有一个逆序对
     *
     * @param root
     */
    private void findWrongNode(TreeNode root) {
        if (root == null) return;
        findWrongNode(root.left);
        // 用上一个跟当前的比较
        if (prev != null && prev.val > root.val) {
            // 第二个逆序对中是较小的那个 所以永远赋值给它
            wrongMin = root;
            // 如果第一个不为空说明目前已经找的了第二个 后边就不用再继续找了 可以执行交换
            if (wrongMax != null) return;
            // 这个时候较大的错误的已经找到了 后边只是需要找那个真正较小的就可以了
            wrongMax = prev;
        }
        prev = root;
        findWrongNode(root.right);
    }


}
