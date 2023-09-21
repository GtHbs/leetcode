def generate(n, result, left, right, res):
    if right > left:
        return
    if right == left == n:
        result.append(res)
        return
    if left < n:
        generate(n, result, left + 1, right, str(res) + "(")
    if right < left:
        generate(n, result, left, right + 1, str(res) + ")")


class Solution(object):
    def generateParenthesis(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        result = []
        generate(n, result, 0, 0, "")
        return result


if __name__ == '__main__':
    so = Solution()
    print(so.generateParenthesis(3))
