from itertools import product
def solution(word):
    l=['A', 'E', 'I', 'O', 'U']
    wordlist =[]
    for i in range(5):
        # 증복 순열로 만들어 질 수 있는 문자 리스트 생성
        for w in list(product(l,repeat=i+1)):
            wordlist.append(''.join(w))
    # sort()를 통해 순서정렬
    wordlist.sort()
    # 주어진 문자의 인덱스 확인
    answer=wordlist.index(word)+1
    return answer