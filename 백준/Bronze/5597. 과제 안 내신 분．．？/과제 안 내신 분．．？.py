n = [i for i in range(1,31)]

while len(n)!=2:
    m = int(input())
    n.remove(m)
print(n[0])
print(n[1])