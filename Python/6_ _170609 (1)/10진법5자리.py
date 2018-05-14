#10진법 5자리  
#good example
#[3,2,1,9,9]
#[3,2,6,0,0]
#back-->front
#ls[i]==9:ls[i]-->0, repeat
#ls[i]!=9:increase ls[i],break

ls=[0]*5


n=10
j=0
while j<n:
    print ls
    i=len(ls)-1
    while i>=0:
        if ls[i]!=9:
            ls[i]=ls[i]+1
            break
        if ls[i]==9:
            ls[i]=0
        i=i-1
    j=j+1
print ls



