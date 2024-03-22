from collections import deque
n,k = map(int,input().split())
p = deque([str(i) for i in range(1,n+1)])
i = 1
answer=[]
while(p):
    if(i%k==0):
        answer.append(p.popleft())
    else:
        p.append(p.popleft())
    i+=1
print("<"+', '.join(answer)+">")