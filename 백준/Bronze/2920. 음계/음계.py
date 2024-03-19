ac = [1,2,3,4,5,6,7,8]
dc = [8,7,6,5,4,3,2,1]
a = list(map(int,input().split()))
if a == ac:
    print("ascending")
elif a == dc:
    print("descending")
else:
    print("mixed")