nums = set([i for i in range(1,10001)])
notSelfnums=set()

for num in nums:
    for n in str(num):
        num=num+int(n)
    notSelfnums.add(num)

selfnums = list(nums-notSelfnums)
selfnums.sort()

for i in selfnums:
    print(i)