mo = ['a','e','i','o','u']
while (1):
    text = input()
    count=0
    if (text =="#"):
        break
    text = text.lower()
    for t in text:
        if t in mo:
            count+=1
    print(count)