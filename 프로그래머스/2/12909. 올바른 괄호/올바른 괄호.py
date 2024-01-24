def solution(s):
    answer = True

    n = 0
    for i in range(len(s)):
        if n<0:
            answer=False
        else:
            if s[i] == "(":
                n+=1
            else:
                n-=1
    if n!=0:
        answer=False
    

    return answer