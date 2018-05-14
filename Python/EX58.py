a=input('input a number >> ')
b=input('input a number >> ')
c=input('input a number >> ')

d=b*b-4*a*c
if d>=0:
    print 'two real roots'
if d==0:
    print 'one real root'
elif d<0:
    print 'imaginary roots'
