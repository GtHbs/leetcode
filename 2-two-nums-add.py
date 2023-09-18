class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = int(val)
        self.next = next


def print_res(node: ListNode):
    while node is not None:
        print(node.val)
        node = node.next


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


"""
    循环遍历
"""


def loop(l1: ListNode, l2: ListNode) -> ListNode:
    carry = 0
    result = ListNode(val=-1, next=None)
    head = result
    while l1 is not None and l2 is not None:
        total = l2.val + l1.val + carry
        next_node = ListNode(val=total % 10, next=None)
        result.next = next_node
        result = result.next
        carry = total / 10
        l1 = l1.next
        l2 = l2.next
    while l1 is not None:
        total = l1.val + carry
        next_node = ListNode(val=total % 10, next=None)
        result.next = next_node
        result = result.next
        carry = total / 10
        l1 = l1.next

    while l2 is not None:
        total = l2.val + carry
        next_node = ListNode(val=total % 10, next=None)
        result.next = next_node
        result = result.next
        carry = total / 10
        l2 = l2.next

    if carry != 0:
        next_node = ListNode(val=carry, next=None)
        result.next = next_node
    return head.next


def recursion(l1: ListNode, l2: ListNode) -> ListNode:
    total = l1.val + l2.val
    carry = total / 10
    res = ListNode(val=total % 10, next=None)
    if l1.next is not None or l2.next is not None or carry != 0:
        if l1.next is not None:
            l1 = l1.next
        else:
            l1 = ListNode(val=0, next=None)

        if l2.next is not None:
            l2 = l2.next
        else:
            l2 = ListNode(val=0, next=None)

        l1.val = int(l1.val + carry)
        res.next = recursion(l1, l2)
    return res


if __name__ == '__main__':
    val_list_1 = [1, 2, 3, 4, 5]
    val_list_2 = [3, 4, 5, 2, 7]
    # 4 6 8 6 2 1
    node_1 = generate_list(value_list=val_list_1)
    node_2 = generate_list(value_list=val_list_2)
    result = loop(l1=node_1, l2=node_2)
    print_res(result)