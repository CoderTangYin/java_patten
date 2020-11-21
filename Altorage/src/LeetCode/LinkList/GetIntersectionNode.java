package LeetCode.LinkList;

/**
 * 相交链表
 */
public class GetIntersectionNode {

    /**
     * 2条相交链表 返回相交的第一个节点
     *
     * 链表 A 为 [0,9,1,2,4,null]，链表 B 为 [3,2,4,null]
     *
     * 思路：①要考虑链表长度是否一样，不一样要转成一样的
     *      ②内存地址相同的2个结点就是相交结点
     *
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // 任意一个为空 就没有交点
        if (headA == null || headB == null) return null;
        ListNode curA = headA, curB = headB;
        // 退出的情况为找到相交或者都遍历完了都为null
        while (curA != curB) {
            // 发现当前结点为空的时候就把比较的拼在后边
            // 经过2次拼接后 2条链表的长度就一样了
            // 链表 A 为 [0,9,1,2,4,3,2,4]
            // 链表 B 为 [3,2,4.0,9,1,2,4]
            // 很明显相同的元素为最后2个 2位第一个相交的结点
            curA = (curA == null) ? headB : curA.next;
            curB = (curB == null) ? headA : curB.next;
        }
        // 返回 curA curB 都一样
        return curA;
    }
}
