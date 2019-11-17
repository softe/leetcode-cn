/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
	public boolean isPalindrome(ListNode head) {
		ListNode p1 = head;
		int size = 0;
		for (; p1 != null; p1 = p1.next, size++) {
		}

		int[] a = new int[size];
		for (int i = 0; head != null; head = head.next, i++) {
			a[i] = head.val;
		}

		for (int i = 0; i < size; i++, size--) {
			if (a[i] != a[size - 1]) {
				return false;
			}
		}
		return true;
	}
}