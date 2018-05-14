#k진법 sz자리  

#back-->front
#ls[i]==k-1:ls[i]-->0, repeat
#ls[i]!=k-1:increase ls[i],break


def next(ls,k):
    i=len(ls)-1
    while i>=0 and not(ls[i]!=k-1):
        ls[i]=0
        i=i-1
    if i>=0:
        ls[i]=ls[i]+1
    return
k=10
sz=3
ls=[0]*sz
n=k**sz
j=0
while j<n:
    print ls
    next(ls,k)
    j=j+1
