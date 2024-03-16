t,m = map(int,input().split())
m+=t*60
m+=int(input())
if m>24*60-1:
    m-=24*60
print(m//60,m%60)