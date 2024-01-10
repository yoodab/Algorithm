def solution(sizes):
    n = 0
    arr = sizes
    # 앞에 긴게 나오게 정렬
    for (i,j) in sizes:
        if i>j:
            arr[n]=[i,j]
        else:
            arr[n]=[j,i]
        n+=1
    #  [긴, 짧] 긴 것 중에 가장 긴 값 찾기
    arr.sort(key = lambda x:x[0],reverse=True)
    answer=arr[0][0]
    #  [긴, 짧] 짧은 것 중에 가장 긴 값 찾고 긴거랑 곱하기
    arr.sort(key = lambda x:x[1],reverse=True)
    answer*=arr[0][1]
    print(answer)
    return answer