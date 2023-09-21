class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def generate_list(value_list: list) -> ListNode:
    list_node = ListNode(val=-1)
    head = list_node
    if value_list is not None and len(value_list) > 0:
        for val in value_list:
            current_node = ListNode(val=val)
            list_node.next = current_node
            list_node = current_node
        pass
    return head.next


def recursion(list1: ListNode, list2: ListNode):
    if list1 is None or list2 is None:
        return list1 or list2
    if list1.val <= list2.val:
        list1.next = recursion(list1.next, list2)
        return list1
    else:
        list2.next = recursion(list1, list2.next)
        return list2


def mergeTwoLists(list1: ListNode, list2: ListNode):
    """
    :type list1: Optional[ListNode]
    :type list2: Optional[ListNode]
    :rtype: Optional[ListNode]
    """
    result = ListNode(val=0, next=None)
    head = result
    while list1 is not None and list2 is not None:
        list1_val = list1.val
        list2_val = list2.val
        if list1_val >= list2_val:
            result.next = list2
            list2 = list2.next
        else:
            result.next = list1
            list1 = list1.next
        result = result.next
    if list1 is not None:
        result.next = list1
    if list2 is not None:
        result.next = list2
    return head.next


if __name__ == '__main__':
    pass
