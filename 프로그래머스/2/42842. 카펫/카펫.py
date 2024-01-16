def solution(brown, yellow):
    x = 3
    y = 0
    # 갈색으로 만들수 있는 네모를 고름 
    
    # 세로 = 갈색/2 - 가로+ 2 
    # 노란색 네모는 (가로-2)*(세로-2)
    answer = []
    while True:
        # 세로 = 갈색/2 - 가로+2
        x = brown//2 -y+2
        if yellow == (x-2)*(y-2):
            print("break")
            break
        y+=1
    
    answer = [x,y]
    return answer