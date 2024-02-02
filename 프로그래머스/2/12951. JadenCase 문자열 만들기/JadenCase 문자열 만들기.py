def solution(s):
    answer = ''
    s = s.lower()
    a = s.split(' ')

    for i in range(len(a)):
        
        if a[i].isalpha()!=False:
            a[i]=a[i].title()
        
    

    return ' '.join(a)