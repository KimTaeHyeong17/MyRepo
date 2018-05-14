#prime
#all x in [2,n), n%x!=0

def find(n):
    x=2
    while x<n:
        if n%x==0:
            break
        x=x+1
    return x

n= input('integer >> ')

x=find(n)
if x<n:
    print 'a divisor :',x
else:
    print 'not found'
