ls=[3,2,1,3,3]

print ls
i=len(ls)-1
while i>=0:
    if ls[i]!=3:
        break
    if ls[i]==3:
        ls[i]=0
    i=i-1
print ls
