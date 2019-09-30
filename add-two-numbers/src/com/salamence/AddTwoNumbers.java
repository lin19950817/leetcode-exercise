package com.salamence;

/**
 * 两数相加
 *   Definition for singly-linked list.
 *    public class ListNode {
 *        int val;
 *        ListNode next;
 *        ListNode(int x) { val = x; }
 *    }
 *
 * @author LinZhenNan lin_hehe@qq.com 2019/09/30 11:10
 */
public class AddTwoNumbers {

    /**
     * 两数相加
     *  遍历两个非空的链表参数 l1, l2,用 carryBit记录 l1, l2链表上
     *  对应节点值的和是否 进位(大于 10),然后将节点值和的个位生成
     *  新的节点,新的节点组成的链表返回
     * 
     * @param l1 非空的链表1
     * @param l2 非空的链表1
     * @author LinZhenNan lin_hehe@qq.com 2019-09-30 11:13
     * @return com.salamence.ListNode
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 记录 l1, l2对应节点值的和是否需要 进位(大于 10)
        boolean carryBit = false;
        // 链表 l1是否已经遍历结束
        boolean l1end = false;
        // 链表 l2是否已经遍历结束
        boolean l2end = false;
        // 返回链表的头结点
        ListNode head = new ListNode(0);
        // 返回链表的游标
        ListNode flag = head;
        // 如果存在链表 l1, l2没有遍历结束或者存在进位没有处理,则进入循环
        while (!l1end || !l2end || carryBit) {
            // 记录 l1, l2对应节点值的和
            int sum = 0;
            // 如果 l1链表没有遍历结束
            if (!l1end) {
                // sum加上 l1节点值
                sum += l1.val;
                // l1移向下一个节点
                l1 = l1.next;
                // 如果没有下一个节点,则将 l1end赋值为 true,表示已遍历结束
                if (null == l1) {
                    l1end = true;
                }
            }
            // 如果 l2链表没有遍历结束
            if (!l2end) {
                // sum加上 l2节点值
                sum += l2.val;
                // l2移向下一个节点
                l2 = l2.next;
                // 如果没有下一个节点,则将 l2end赋值为 true,表示已遍历结束
                if (null == l2) {
                    l2end = true;
                }
            }
            // 如果存在进位,则将节点值的和 +1
            if (carryBit) {
                sum++;
            }
            // 如果节点值的和 >10,将节点值的和 -10.然后设置进位
            if (sum >= 10) {
                sum -= 10;
                // 设置进位
                if (!carryBit) {
                    carryBit = true;
                }
            } else {
                // 设置进位
                if (carryBit) {
                    carryBit = false;
                }
            }
            // 生成新节点并与上一节点关联
            flag.next = new ListNode(sum);
            // 移向下一个节点
            flag = flag.next;
        }
        // 将结果返回
        return head.next;
    }
}
