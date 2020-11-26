package LeetCode.LinkList;

/**
 * 给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。
 */
public class Partition {
    /**
     * 输入: head = 1->4->3->2->5->2, x = 3
     * 输出: 1->2->2->4->3->5
     *
     * @param head
     * @param x
     * @return
     */
    public ListNode partition(ListNode head, int x) {
        if (head == null) return null;
        ListNode lh = new ListNode(0);
        ListNode lt = lh;
        ListNode rh = new ListNode(0);
        ListNode rt = rh;
        while (head != null) {
            if (head.val < x) {
                lt.next = head;
                // lt尾结点相当于是上一个结点 通过他跟下一个结点产生关系
                // 类似于全局保持局部上一次的属性
                lt = head;
            } else {
                rt.next = head;
                rt = head;
            }
            head = head.next;
        }
        /**
         * 倒数第N个结点val的值>=x, val后所有结点值都<x 都拼接给了lt
         * 这个时候 rt.next后的最后的结点将会是A.next 所以需要
         * 置为null
         */
        rt.next = null;
        lt.next = rh.next;
        return lh.next;
    }
}
