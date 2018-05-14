#prime
#all x in [2,n), n%x!=0 (n>1)

def find(n):
    x=2
    while x<n:
        if n%x==0:
            break
        x=x+1
    return n>1 and not(x<n) #n>1 and no diviosr

beg=input('beg >> ')
end=input('end >> ')

n=beg
while n<=end:
    if find(n):
        print n,
    n=n+1
print
