import heapq

def solution(scoville, K):
    answer = 0
    heapq.heapify(scoville)


    while scoville[0] < K:
        if len(scoville)<2:
            answer=-1
            break

        h = heapq.heappop(scoville) + heapq.heappop(scoville) * 2
        heapq.heappush(scoville, h)


        answer += 1

    
    return answer