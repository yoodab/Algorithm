deg = []
for _ in range(3):
    deg.append(int(input()))

if(sum(deg)!=180):
    print("Error")
else:
    setDeg = list(set(deg))
    if(len(setDeg)==1):
        print("Equilateral")
    elif(len(setDeg)==2):
        print("Isosceles")
    else:
        print("Scalene")