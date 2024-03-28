n, m = map(int, input().split())
bag = [0]*n
for a in range(m):
    i,j,k = map(int, input().split())
    for b in range(i-1,j):
        bag[b] = k 
print(' '.join(map(str,bag)))