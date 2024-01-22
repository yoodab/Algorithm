from itertools import combinations


def solution(clothes):
    
    answer = 0

    cloth = {}
    # 딕셔너리에 종류:개수 로 정리함
    for i in clothes:
        if cloth.get(i[1]) != None:
            cloth[i[1]] += 1
            # print(cloth[i[1]])
        else: 
            cloth[i[1]] = 1




    gop =1
    for i in cloth.values():

        gop *= i+1
    answer += gop-1
    

    return answer