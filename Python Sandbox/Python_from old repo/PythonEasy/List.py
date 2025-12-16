words = ["spam", "egg", "spam", "sausage"]
print("spam" in words)

#list with conditional statements 
nums = [10, 9, 8, 7, 6, 15]
#nums[0] = nums[1] - 5
#if 4 in nums: 
#    print(nums[3])
#else:
#    print(nums[4])

#list returns boolean result
print(4 in nums)
print(not 6 in nums)

#list works with loops 
for num in nums:
    num += 1
    print(num)

#list works with functions 
print(len(nums))

#add element in your array 
nums += [25]
print(len(nums))

nums.append(100)
print(nums)