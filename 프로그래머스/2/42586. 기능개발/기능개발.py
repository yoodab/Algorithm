import math


def solution(progresses, speeds):
    answer = []
    times=[]

    for i in range(len(progresses)):
        time=100
        times.append(math.ceil((time-progresses[i])/speeds[i]))
    print(times)

    N=0

    for i in range(len(times)):
        if times[i] > times[N]:
            answer.append(i-N)
            N=i
    answer.append(len(progresses) - N)
    print(answer)
    return answer