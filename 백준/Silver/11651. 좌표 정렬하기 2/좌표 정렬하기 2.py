n = int(input())
p = []
for _ in range(n):
    p.append(list(map(int,input().split())))
p.sort(key=lambda x:(x[1],x[0]))

for i in p:
    print(i[0],i[1])