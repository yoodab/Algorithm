def solution(nums):
    answer = ''
    dic = {}
    
    for i in nums:
        if dic.get(i)!=None and dic.get(i)>=1:
            dic[i]+=1
        else:
            dic[i] = 1
    
    if len(nums)//2 > len(dic):
        answer = len(dic)
    else:
        answer = len(nums)//2
    return answer