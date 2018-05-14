

for j in range(10):
    n1 = 4-j/2
    n2 = 1 + j/2 + j/2
    n3 = 4-j/2
    for i in range(n1):
        print '.',
    for i in range(n2):
        print '*',
    for i in range(n3):
        print '.',
    print
#####################################################
j=0
while j<10:
    n1=4-j/2
    n2=1+j/2+j/2
    n3=4-j/2
    i=0
    while i<n1:
        print '.',
        i=i+1
    i=0
    while i<n2:
        print '*',
        i=i+1
    i=0
    while i<n3:
        print '.',
        i=i+1
    print
    j=j+1
##########################################
a=[4,4,3,3,2,2,1,1]
i=0
while i<len(a):
    ai=a[i]
    print '.'*ai,
    i=i+1

b=[1,1,3,3,5,5,7,7,9,9]
i=0
while i<len(b):
    bi=b[i]
    print '*'*bi
    i=i+1

c=a
i=0
while i<len(c):
    ci=c[i]
    print '.'*ci
    i=i+1
print
