e,s,m = map(int,input().split())

Y = 1 
while(1):
    
    if (Y-e)%15 == 0 and (Y-s)%28 == 0 and (Y-m)%19 == 0:
        break
    Y += 1
    
print(Y)