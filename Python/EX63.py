beg=input('input beg >> ')
end=input('input end >> ')

a=range(beg,end) ; i=0
while i<len(a):
    print a[i],',',
    if a[i]%2==0:
        print 'even'
    else:
        print 'odd'
    i=i+1

