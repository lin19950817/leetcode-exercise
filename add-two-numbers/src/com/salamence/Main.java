package com.salamence;

/**
 * description
 *
 * @author LinZhenNan lin_hehe@qq.com 2019/09/30 13:53
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ListNode l1 = getListNodeByArray(new int[]{2, 4, 3});
        ListNode l2 = getListNodeByArray(new int[]{5, 6, 4});

        System.out.println(getPrintListNode(new AddTwoNumbers().addTwoNumbers(l1, l2)));
    }

    /**
     * 将整型数组转成链表
     * 
     * @param array 整形数组
     * @author LinZhenNan lin_hehe@qq.com 2019-09-30 14:12
     * @return com.salamence.ListNode
     */
    public static ListNode getListNodeByArray(int[] array) throws Exception {
        if (null == array || 0 == array.length) {
            throw new Exception("array is null or its length is zero");
        }
        ListNode head = new ListNode(0);
        ListNode flag = head;
        for (int i : array) {
            flag.next = new ListNode(i);
            flag = flag.next;
        }
        return head.next;
    }

    /**
     * 链表的打印字符串
     * 
     * @param listNode 链表
     * @author LinZhenNan lin_hehe@qq.com 2019-09-30 14:13
     * @return java.lang.String
     */
    public static String getPrintListNode(ListNode listNode) throws Exception {
        if (null == listNode) {
            throw new Exception("listNode is null");
        }
        StringBuilder sb = new StringBuilder(Integer.toString(listNode.val));
        while (null != listNode.next) {
            listNode = listNode.next;
            sb.append(" -> " + listNode.val);
        }
        return sb.toString();
    }
}
