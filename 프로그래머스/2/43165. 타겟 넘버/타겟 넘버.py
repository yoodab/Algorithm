def solution(numbers, target):
    answer = 0
    aList = [0]
    for num in numbers:
        tmp =[]
        for j in aList:
            tmp.append(j+num)
            tmp.append(j-num)
        aList = tmp.copy()
    answer = aList.count(target)
    return answer