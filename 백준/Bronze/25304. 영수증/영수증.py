cost = int(input())
N = int(input())
answer = 0
for i in range(N):
    a,b = map(int,input().split())
    answer += a*b
print("Yes" if answer==cost else "No")