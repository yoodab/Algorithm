n = input()
sum = 0
for i in n:
    if i == "0":
        sum+=9
    else:
        sum+=int(i)
print(sum)