from collections import deque

def solution(prices):
    answer = []
    # 값을 비교해서 떨어질때까지 값을 계산해서 넣기
    prices = deque(prices)
    while prices:
        N=0
        price = prices.popleft()
        for i in prices:
            N+=1
            if price>i:
                break
        
        answer.append(N)

    return answer