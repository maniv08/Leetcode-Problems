# ~ Recursive Approach

class Solution:
    def removeElements(self, head, val):
        if head is None:
            return head

        if head.val == val:
            return self.removeElements(head.next, val)
        else:
            head.next = self.removeElements(head.next, val)
            return head


# _________________________________________________________
# ~ Iterative Approach

# class Solution:
#     def removeElements(self, head, val):
#         dummy = ListNode(0)
#         dummy.next = head

#         prev = dummy
#         curr = head

#         while curr is not None:
#             if curr.val == val:
#                 prev.next = curr.next
#             else:
#                 prev = curr

#             curr = curr.next

#         return dummy.next