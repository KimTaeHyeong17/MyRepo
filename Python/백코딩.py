def is_prime(n):
    x=2
    while x<n:
        if n%x==0:
            return x
        x=x+1

n=input('input last number >> ')
f=is_prime(n)

if not(f):
    print n
        




