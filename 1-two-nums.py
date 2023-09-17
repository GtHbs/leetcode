def violence(nums: list, target: int) -> list:
    if nums is not None and len(nums) > 0:
        for i in range(0, len(nums)):
            temp_i = nums[i]
            for j in range(i + 1, len(nums)):
                temp_j = nums[j]
                if temp_i + temp_j == target:
                    return [i, j]
    return []


def hashtable(nums: list, target: int) -> list:
    result_dict = {}
    if nums is not None and len(nums) > 0:
        for i in range(0, len(nums)):
            temp = nums[i]
            sub = target - temp
            if sub in result_dict:
                return [result_dict[sub], i]
            else:
                result_dict[temp] = i
    return []


if __name__ == '__main__':
    nums = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    print(violence(nums=nums, target=17))
    print(hashtable(nums=nums, target=17))
