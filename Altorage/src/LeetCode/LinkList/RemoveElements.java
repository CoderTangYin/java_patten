package LeetCode.LinkList;

/**
 * 移除链表结点
 */
public class RemoveElements {

    /**
     * 输入: 1->2->6->3->4->5->6, val = 6
     * 输出: 1->2->3->4->5
     *
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode newHead = new ListNode(0);
        ListNode newTail = newHead;
        while (head != null) {
            if (head.val != val) {
                newTail = newTail.next = head;
            }
            head = head.next;
        }
        newTail.next = null;
        return newHead.next;
    }

    public static void main(String[] args) {
        int[] data = {1,2,6,3,4,5,6};
        ListNode dummyHead = new ListNode(-1);
        ListNode tail = dummyHead;
        for (int i = 0; i < data.length; i++) {
            ListNode node = new ListNode(data[i]);
            tail.next = node;
            tail = node;
        }

        ListNode head = dummyHead.next;
        while (head != null) {
//            System.out.println(head.val);
            head = head.next;
        }

        RemoveElements removeElements = new RemoveElements();
        ListNode resNode = removeElements.removeElements(dummyHead.next, 6);
        while (resNode != null) {
            System.out.print(resNode.val + "--");
            resNode = resNode.next;
        }
    }
}
