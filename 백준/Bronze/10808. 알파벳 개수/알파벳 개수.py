N = input()
answer=[0 for _ in range(26)]
for i in N:
    answer[ord(i)-ord('a')] +=1
print(*answer, end=" ")