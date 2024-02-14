def solution(numbers, target):
    answer = 0
    aList = [0]
    for num in numbers:
        tmp =[]
        for i in aList:
            tmp.append(i+num)
            tmp.append(i-num)
        aList = tmp.copy()
        
    answer = aList.count(target)
    return answer