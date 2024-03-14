for i in range(3):
    t1,m1,s1,t2,m2,s2 = map(int,input().split())
    s1 = s1+m1*60+t1*60*60
    s2 = s2+m2*60+t2*60*60
    time = s2-s1
    print(time//3600,time%3600//60,time%60)