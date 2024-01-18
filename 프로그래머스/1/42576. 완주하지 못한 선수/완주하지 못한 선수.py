def solution(participant, completion):
    answer = ''
    dic = {}

    for i in participant:
        if dic.get(i)!=None and dic.get(i)>=1:
            dic[i]+=1
        else:
            dic[i] = 1
        
    
    for i in completion:
        dic[i] -= 1

    for k,v in dic.items() :
        if v!= 0:
            answer+=k

    return answer