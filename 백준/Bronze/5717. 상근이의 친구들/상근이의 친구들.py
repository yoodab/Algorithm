while(1):
    friend = list(map(int,input().split()))
    
    if(friend[0]==0&friend[1]==0):
        break
    print(friend[0]+friend[1])