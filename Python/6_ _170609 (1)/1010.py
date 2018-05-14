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
        if s>0:                                #贸澜老锭
            print '+',
        print n,
        s=s+n
    n=n+1

print '=',s

#惯斑贸府 & 去钦贸府 郴何 急琶贸府

