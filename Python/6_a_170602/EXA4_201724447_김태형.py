
def sum(a,b,c):
    i=0
    while i<len(a):
        c[i]=a[i]+b[i]
        i=i+1
    return 
    
a=[11,22,33,44]
b=[4, 2, -1,-2]
c=[0,0,0,0]

sum(a,b,c)
print c
