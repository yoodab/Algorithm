now = list(map(int,input().split()))
time = now[0]*3600+now[1]*60+now[2]
time = time + int(input())

sec = time%60
min = time//60%60
time = time//3600%24
if(time%24==0): time=0
print(time, min, sec)