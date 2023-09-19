def is_valid(s):
    if s is None or len(s) <= 0:
        return True
    stack = []
    for bracket in s:
        if bracket in ("(", "[", "{"):
            stack.append(bracket)
        else:
            if len(stack) == 0:
                return False
            stack_top = stack.pop()
            if (bracket == ")" and stack_top != "(") or (bracket == "]" and stack_top != "[") or (
                    bracket == "}" and stack_top != "{"):
                return False
    return len(stack) == 0


if __name__ == '__main__':
    s = "()"
    print(is_valid(s))
