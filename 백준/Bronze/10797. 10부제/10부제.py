num = int(input())
cars=list(map(int,input().split()))

count=0
for car in cars:
    if car == num:
        count=count+1
print(count)    