n = int(input())
grade = []
for i in range(n):
    mem = list(map(int,input().split()))
    grade.append(mem)

for mem1 in grade:
    count = 0
    for mem2 in grade:
        if mem1[0]<mem2[0] and mem1[1]<mem2[1]:
            count+=1
    print(count+1,end=" ")
    