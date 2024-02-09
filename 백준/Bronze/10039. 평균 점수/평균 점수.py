answer = 0
for i in range(5):
    a = int(input())
    answer += a if a>40 else 40
print(answer//5)