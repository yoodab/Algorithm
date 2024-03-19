word = input()
alist = [-1]*26
idx = 0
for w in word:
    if alist[ord(w)-ord('a')] == -1:
        alist[ord(w)-ord('a')]= idx
    idx+=1
for i in alist:
    print(i, end=' ')