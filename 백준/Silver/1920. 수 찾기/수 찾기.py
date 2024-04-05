n = int(input())
a = set(map(int,input().split()))
m = int(input())
b = list(map(int,input().split()))
for i in range(len(b)):
    print(int(b[i] in a))