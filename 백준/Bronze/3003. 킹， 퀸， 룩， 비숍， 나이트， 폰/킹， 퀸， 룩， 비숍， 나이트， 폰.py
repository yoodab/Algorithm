piece = [1,1,2,2,2,8]
mal = list(map(int,input().split()))
answer = []
for i in range(6):
    answer.append(piece[i]-mal[i]) 
print(' '.join(str(i) for i in answer))