package LeetCode.LinkList;

/**
 * 判断链表中是否有环  快慢指针典型题
 */
public class HasCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            if (slow == fast) return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
