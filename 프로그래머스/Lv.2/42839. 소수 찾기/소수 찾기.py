from itertools import permutations

def sosu(num):
    if num==1 or num==0:
        sosu = False
        return sosu
    sosu = True

    for i in range(2,num//2+1):
        if num % i == 0:
            sosu = False
            break
    return sosu


def solution(numbers):
    cnt = 0
    num = [numbers[i] for i in range(len(numbers))]
    Arr = set(num)
    for i in Arr:
        if sosu(int(i)) == True:
            cnt+=1

    for i in range(2,len(numbers)+1):
        Arr = set(permutations(num,i))
        Arr = list(Arr)
        Arr = [''.join(item) for item in Arr]
        print(Arr)
        for i in Arr:
            if i[0]=="0":
                continue
            else:
                if sosu(int(i)) == True:
                    cnt+=1

    print(cnt)

    answer = cnt
    return answer

    # print(num)
    # 숫자를 만들어야함
    # 어떤 식으로 만드는 것이 좋을까?
    # 첫자리에 0이 나오면 삭제
    #  1-7자리까지 만들수 있음