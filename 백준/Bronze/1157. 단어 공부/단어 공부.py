word = input().lower()

wordlist = [0]*26
for i in word:
    wordlist[ord(i)-ord('a')]+=1
if wordlist.count(max(wordlist))!=1:
    print("?")
else:
    print(chr(wordlist.index(max(wordlist))+ord('A')))