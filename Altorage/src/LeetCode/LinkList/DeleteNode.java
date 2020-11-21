package LeetCode.LinkList;

/**
 * 删除链表的某个结点
 */
public class DeleteNode {
    public void deleteNode(ListNode node) {
        if (node == null) return;
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
