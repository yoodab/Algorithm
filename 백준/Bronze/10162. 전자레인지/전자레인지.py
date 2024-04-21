time = int(input())

a = time//300
b = time%300//60
c = time%60//10
if(time%10!=0):
    print(-1)
else:
    print(a,b,c)