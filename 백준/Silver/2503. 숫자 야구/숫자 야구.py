from itertools import permutations


def solution():
    n = int(input())
    a = [str(a) for a in range(1,10)]
    answer = list(permutations(a,3))
    arr = list(permutations(a,3))

    for i in range(n):
        
        N,S,B=map(int,input().split())

        N = str(N)
        for j in arr:
            b = 0
            s = 0
            for k in range(3):
                if N[k] == j[k]:
                    s+=1

                elif N[k] in j:
                    b+=1

            if S!=s or B!=b:
                answer.remove(j)
        
        arr = answer.copy()


    print(len(answer))







solution()