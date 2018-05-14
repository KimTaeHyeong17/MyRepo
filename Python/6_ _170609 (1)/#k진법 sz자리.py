#k진법 sz자리  

#back-->front
#ls[i]==k-1:ls[i]-->0, repeat
#ls[i]!=k-1:increase ls[i],break


k=10
sz=3

ls=[0]*sz


n=k**sz
j=0
while j<n:
    print ls
    i=len(ls)-1
    while i>=0:
        if ls[i]!=k-1:
            ls[i]=ls[i]+1
            break
        if ls[i]==k-1:
            ls[i]=0
        i=i-1
    j=j+1
print ls



