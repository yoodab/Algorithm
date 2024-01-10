def solution():
    A = int(input())
    T = int(input())
    # fd :  0 => 뻔  1 => 데기
    fd = int(input()) 
    f = 0
    d = 0
    cnt = -1
    n = 1
    while 1:
        #  번 데기 번 데기 x2 
        for i in range(2):
            f+=1
            cnt+=1
            if fd == 0:
                if f == T:
                    return print(cnt%A)
            d+=1
            cnt+=1
            if fd == 1:
                if d == T:
                    return print(cnt%A)
        #  n 회차 +1 만큼 뻔뻔뻔 
        for i in range(n+1):
            f+=1
            cnt+=1
            if fd == 0:
                if f == T:
                    return print(cnt%A)
        # 데기데기데기
        for i in range(n+1):
            d+=1
            cnt+=1
            if fd == 1:
                if d == T:
                    return print(cnt%A)
        n+=1
    



solution()