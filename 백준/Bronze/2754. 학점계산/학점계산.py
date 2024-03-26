s = input()*2
a = float(0)
if s[0] =="A":
    a+=4
elif s[0] =="B":
    a+=3
elif s[0] =="C":
    a+=2
elif s[0] =="D":
    a+=1

if s[1] == "+":
    a+=0.3
elif s[1] == "-":
    a-=0.3
print(a)