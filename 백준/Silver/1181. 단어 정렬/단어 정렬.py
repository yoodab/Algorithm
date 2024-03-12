N = int(input())
word =set()

for i in range(N):
    word.add(input())

word=list(word)

word.sort()
word.sort(key=len)

for i in word:
    print(i)