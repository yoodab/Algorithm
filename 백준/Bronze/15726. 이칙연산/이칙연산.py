a = list(map(int,input().split()))
answer = a[0]*a[1]//a[2]
if answer < int(a[0]/a[1]*a[2]):
    answer = int(a[0]/a[1]*a[2])
print(answer)