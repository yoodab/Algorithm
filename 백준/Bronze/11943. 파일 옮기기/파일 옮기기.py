box1 = list(map(int,input().split()))
box2 = list(map(int,input().split()))

print(min((box1[0]+box2[1]),(box1[1]+box2[0])))