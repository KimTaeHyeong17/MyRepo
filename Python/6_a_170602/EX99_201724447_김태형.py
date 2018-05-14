
def sum(a):
    s=0
    i=0
    while i<len(a):
        s=s+a[i]
        i=i+1
    return s

a=[11,22,33,44]

s=sum(a)

print 'sum=',s
