def solution(priorities, location):
    
    answer = 0
    while priorities:
        maxV = max(priorities)
        nowP = priorities.pop(0)
        location -= 1 
        if nowP != maxV:
            priorities.append(nowP)
            if location < 0:
                location = len(priorities) -1
        else:
            answer += 1
            if location < 0:
                break

    return answer