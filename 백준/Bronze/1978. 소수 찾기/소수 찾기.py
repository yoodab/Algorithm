n = int(input())
nums = list(map(int,input().split()))
count = n
for num in nums:
    if num == 1:
        count-=1
    for i in range(2,num):
        if num % i ==0:
            count-=1
            break
print(count)