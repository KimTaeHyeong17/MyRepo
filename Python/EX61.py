n=input('input number >>')

s=0;
ai=1
for i in range(1,n):
    print ai,
    ai=2*ai+1 
    s=s+ai 
print '\nsum =',+s
