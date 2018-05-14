
def sum(a,b):
    c=[0,0,0,0]
    i=0
    while i<len(a):
        c[i]=a[i]+b[i]
        i=i+1
    return c
    


a=[11,22,33,44]
b=[4, 2, -1,-2]


c=sum(a,b)
print c
