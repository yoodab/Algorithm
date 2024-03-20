n = int(input())
m = 1
answer = 1
i=1
while(1):
    if n-m <1:
        break
    else:
        m+=6*i
        i+=1
        answer+=1
print(answer)