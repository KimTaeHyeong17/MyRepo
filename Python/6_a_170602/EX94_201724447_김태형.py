
def line(n1,n2,n3):
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

    return


j=0
while j<10:
    n1=9-j
    n2=1+2*j
    n3=9-j
    line(n1,n2,n3)

    j=j+1
