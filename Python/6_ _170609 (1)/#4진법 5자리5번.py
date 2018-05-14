#4진법 5자리  

#good example
#[3,2,1,3,3]
#[3,2,2,0,0]

#[2,3,3,3,3]
#[3,0,0,0,0]


#[3,3,3,3,3]
#[0,0,0,0,0]

#back-->front
#ls[i]==3: ls[i]=0, repeat
#ls[i]!=3: increasels[i],break

ls=[0]*5


s=0
while s<100:
    print ls
    i=len(ls)-1
    while i>=0:
        if ls[i]!=3:
            ls[i]=ls[i]+1
            break
        if ls[i]==3:
            ls[i]=0
        i=i-1
    s=s+1
print ls

