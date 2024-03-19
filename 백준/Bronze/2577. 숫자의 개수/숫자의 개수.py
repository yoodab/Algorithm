num=1
answer = [0]*10
for _ in range(3):
    num *= int(input())
for n in str(num):
    answer[int(n)]+=1
for a in answer:
    print(a)