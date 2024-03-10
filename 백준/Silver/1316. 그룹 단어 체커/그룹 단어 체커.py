N = int(input())
for i in range(N):
    text=input()
    for i in range(len(text)-1):
        if text[i] == text[i+1]:
            pass
        else:
            if (text[i] in text[i+1:]):
                N-=1
                break
                
print(N)