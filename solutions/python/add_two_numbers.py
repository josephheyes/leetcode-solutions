#
# @lc app=leetcode id=2 lang=python3
#
# [2] Add Two Numbers
#

# @lc code=start
# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        ptr = result = ListNode(0)
        p = 0

        while(l1 or l2 or p):
            if l1:
                p += l1.val
                l1 = l1.next

            if l2:
                p += l2.val
                l2 = l2.next
            result.next = ListNode(p%10)
            result = result.next
            p //= 10
        return ptr.next


# @lc code=end

