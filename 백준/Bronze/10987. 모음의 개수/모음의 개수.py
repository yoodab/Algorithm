mo = ['a','e','i','o','u']

text = input()
answer = 0
for t in text:
    if t in mo:
        answer+=1
print(answer)