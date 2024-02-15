def solution(n, computers):
    answer = 0
    visited = [False for _ in range(n)]
    # 컴퓨터 번호
    for com in range(n):
        # 번호대로 넣고 연결된 번호는 connect에 표시해주는 함수
        if visited[com] == False:
            dfs(computers, com, visited)
            answer += 1 
    return answer
    



def dfs(computers, now, visited):
    visited[now] = True
    for com in range(len(computers)):

        if com != now and computers[com][now] == 1: 
            if visited[com] == False:
                dfs(computers, com, visited)