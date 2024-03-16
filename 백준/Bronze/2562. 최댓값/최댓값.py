idx = 0
max = 1 
for i in range(9):
    a = int(input())
    if max < a:
        max = a
        idx = i+1
print(max)
print(idx)