n = int(input())
sum = 0 
i=1
while(True):
    sum+=i
    if(sum==n):
        break
    elif(sum>n):
        i-=1
        break
    i+=1
print(i)