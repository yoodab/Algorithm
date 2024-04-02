n,k = map(int,input().split())
j=[]
for i in range(1,n+1):
    if n%i==0:
        j.append(i)

if len(j)<k:
    print(0)
else:
    print(j[k-1])
    