import sys

N = int(int(input()))
nums=[]
for i in range(N):
    nums.append(int(sys.stdin.readline()))
    
nums.sort()

for i in nums:
    print(i)
