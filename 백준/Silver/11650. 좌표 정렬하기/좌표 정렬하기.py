N = int(input())
spot = []
for i in range(N):
    spot.append(list(map(int,input().split())))
spot.sort()
for i in range(N):
    print(spot[i][0],spot[i][1])