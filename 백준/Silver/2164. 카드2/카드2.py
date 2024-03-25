from collections import deque
cardlist = deque([n+1 for n in range(int(input()))])
while(len(cardlist)>1):
    cardlist.popleft()
    cardlist.append(cardlist.popleft())
print(cardlist[0])