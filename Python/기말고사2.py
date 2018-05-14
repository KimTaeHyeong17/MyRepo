for j in range(10):
    n1=(18-j)/2
    n2=2*((j+1)/2)+1
    

    for i in range(n1):
        print '.',
    for i in range(n2):
        print '*',
    for i in range(n1):
        print '.',
    print

    
for j in range(8):
    n3=(8-j)/2
    n4=2*((j+1)/2)+1
    n5=2*((8-j)/2)+1
    for i in range(n3):
        print '*',
    for i in range(n4):
        print '.',
    for i in range(n5):
        print '*',
    for i in range(n4):
        print '.',
    for i in range(n3):
        print '*',
    print 
