num = int(input())
mnum=0
for nu in range(num):
    crn = nu
    for n in str(nu):
        crn+=int(n)
    if crn == num:
        mnum = nu
        break
        
print(mnum)