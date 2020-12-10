package LeetCode.LinkList;

/**
 * 合并两个有序链表
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 */
public class MergeTwoLists {

    /**
     * 非递归实现
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode dummyHead = new ListNode(-1);
        ListNode tail = dummyHead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail = tail.next = l1;
                l1 = l1.next;
            } else {
                tail = tail.next = l2;
                l2 = l2.next;
            }
        }
        if (l1 == null) {
            tail.next = l2;
        } else if (l2 == null) {
            tail.next = l1;
        }
        return dummyHead.next;
    }


    /**
     * 递归实现
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        return null;
    }



}
