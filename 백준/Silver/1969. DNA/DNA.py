def solution():
    N,L = map(int,input().split())
    dna = ""
    data = []
    cnt = 0

    for i in range(N):
        data.append(input())

    for j in range(L):
        dnaNum = {"A":0,"C":0,"G":0,"T":0}    
        for i in range(N):
            dnaNum[data[i][j]]+=1
        sel = max(dnaNum,key=dnaNum.get)
        dna+=sel
        for i in range(N):
            if data[i][j]!=sel:
                cnt+=1

    print(dna)
    print(cnt)

solution()