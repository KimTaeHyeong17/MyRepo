def find(beg,end):
    i=beg
    while i<=end:
        if i%5==0:
            break;
        i=i+1

    return i


beg=input('beg >> ')
end=input('end >> ')


i=find(beg,end)
if i<=end:
    print 'found:',i

else:
    print 'not found'
