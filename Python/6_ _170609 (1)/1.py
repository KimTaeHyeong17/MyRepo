beg=input('beg >> ')
end=input('end >> ')

i=beg
while i<=end:
    if i%5==0:
        break;
    i=i+1

if i<=end:
    print 'found:',i
