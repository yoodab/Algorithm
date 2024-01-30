
N, M = map(int, input().split())

matrix1 = []
for _ in range(N):
    row = list(map(int, input().split()))
    matrix1.append(row)

matrix2 = []
for _ in range(N):
    row = list(map(int, input().split()))
    matrix2.append(row)

result_matrix = []
for i in range(N):
    result_row = []
    for j in range(M):
        result_row.append(matrix1[i][j] + matrix2[i][j])
    result_matrix.append(result_row)

for row in result_matrix:
    for element in row:
        print(element, end=" ")
    print() 
