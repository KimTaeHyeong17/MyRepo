#prime
#all x in [2,n), n%x!=0 (n>1)



beg=input('beg >> ')
end=input('end >> ')




s=0
n=beg
while n<=end:
    x=2
    while x<n and not (n%x==0):
        x=x+1
    if n>1 and not(x<n):
        print n,
        s=s+n
    n=n+1
print
print 'sum=',s
