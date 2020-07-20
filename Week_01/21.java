class Solution {
	
	//21. 合并两个有序链表
    //合并有序的两个链表，比较简单；两种方式递归；循环。
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l2 == null) return l1;
        if (l1 == null) return l2;

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
        // return null;
    }
	
	

｝