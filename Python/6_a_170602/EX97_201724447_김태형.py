

def disc(a,b,c):
    return b**2-4.0*a*c

#ax^2+bx+c=0
a=input('input first coeff. >> ');
b=input('input second coeff. >> ');
c=input('input third coeff. >> ');
#input:a,b,c
#return:b**2-4.0*a*c
d=disc(a,b,c)

if d==0.0:
    print 'one root'
elif d>0.0:
    print 'two real roots'
else:
    print 'two imaginary roots'
