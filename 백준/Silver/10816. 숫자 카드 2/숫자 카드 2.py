n = int(input())
card = dict()
keys = list(map(int,input().split()))
for key in keys:
    if key in card:
        card[key]+=1
    else:
        card[key]=1
        
m = int(input())
keys = list(map(int,input().split()))
for key in keys:
    if key in card:
        print(card[key],end=" ")
    else:
        print(0,end=" ")