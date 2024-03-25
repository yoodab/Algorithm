text = input()
for i in range(1,len(text)+1):
    print(text[i-1], end="")
    if i%10==0:
        print()