def solution(answers):
    answer = []
    # 수포자들이 적은 답
    std1 = [1, 2, 3, 4, 5]
    std2 = [2, 1, 2, 3, 2, 4, 2, 5]
    std3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]

    a =[0,0,0]
    a1=1
    a2=1
    a3=1
    #  적은 답과 실제 답 비교
    for i in range(len(answers)):
        if answers[i]==std1[i%len(std1)]:
            a[0]=a1
            a1+=1
        if answers[i]==std2[i%len(std2)]:
            a[1]=a2
            a2+=1
        if answers[i]==std3[i%len(std3)]:
            a[2]=a3
            a3+=1
    #  가장 많이 맞은 사람
    for i in range(3):
        if a[i]==max(a):
            answer.append(i+1)
    print(answer)
    return answer