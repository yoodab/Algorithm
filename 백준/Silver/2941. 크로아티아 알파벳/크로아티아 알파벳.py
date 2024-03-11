alpha = ["c=","c-","dz=","d-","lj","nj","s=","z="]

str = input()

for al in alpha:
    str=str.replace(al,"1")
print(len(str))