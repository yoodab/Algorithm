n = 0
h = 0
for i in range(4):
    a,b = map(int,input().split())
    n = n-a+b
    if h < n:
        h = n
print(h)