#prime
#all x in [2,n), n%x!=0 (n>1)


def is_prime(n):
    x=2
    while x<n and not(n%x==0):
        x=x+1
    return n>1 and not(x<n)



beg=input('beg >> ')
end=input('end >> ')




n=beg
while n<=end and not(is_prime(n)):

    n=n+1

if n<=end:
     print 'min prime :',n
