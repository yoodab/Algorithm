N = list(map(int,input().split()))
check = 0
for i in range(5):
    check += N[i]**2
print(check%10)