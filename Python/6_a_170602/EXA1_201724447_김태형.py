def increase(a):
    i=0
    while i<len(a):
        a[i]=a[i]+1
        i=i+1
    return a
a=[11,22,33,44]
#input : a
a=increase(a)
#return : a
print a
