n = int(input())
for i in range(n):
    vps = input()
    a = 0
    for t in vps:
        if a<0:
            break
        if t=="(":
            a+=1
        else:
            a-=1
    if a==0:
        print("YES")
    else:
        print("NO")