K,N = map(int,input().split())
count = list(map(int,input().split()))
answer=[]
for i in count:
    answer.append(i-K*N)
print(' '.join(str(s) for s in answer))