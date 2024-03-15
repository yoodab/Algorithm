s1,s2 = map(int,input().split())
a = (s1+s2)//2
b = s1-a
if s1-s2<0 or (s1+s2)%2!=0:
    print(-1)
else:
    print(a,b)