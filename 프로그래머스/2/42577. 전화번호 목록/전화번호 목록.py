def solution(phone_book):
    # 전화번호부를 sort를 함 
    phone_book.sort()
    answer = True
    
    for i in range(1,len(phone_book)):
        if len(phone_book[i-1])<len(phone_book[i]):
            if phone_book[i-1] == phone_book[i][0:len(phone_book[i-1])]:
                answer = False
                break
        
    return answer