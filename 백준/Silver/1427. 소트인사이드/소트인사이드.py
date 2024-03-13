num = input()
nums =[]
for i in num:
    nums.append(i)
nums.sort(reverse=True)
print(''.join(nums))