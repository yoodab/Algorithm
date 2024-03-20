n = int(input())
code = input()
answer = 0
for i in range(n):
    answer += (ord(code[i])-ord('a')+1)*31**i
print(answer%1234567891)