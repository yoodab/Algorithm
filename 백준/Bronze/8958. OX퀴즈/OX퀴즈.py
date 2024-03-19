n = int(input())
for _ in range(n):
    ox = input()
    olen=1
    count = 0 
    for i in ox:
        if i == "O":
            count+=olen
            olen+=1
        else:
            olen=1
    print(count)