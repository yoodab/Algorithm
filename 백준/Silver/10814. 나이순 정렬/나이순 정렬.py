n = int(input())
mems = []
for i in range(n):
    mem = list(map(str,input().split()))
    mems.append(mem)
mems.sort(key = lambda x:int(x[0]))
for mem in mems:
    print(mem[0],mem[1])