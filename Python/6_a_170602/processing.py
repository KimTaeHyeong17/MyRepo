beg=input('input beg >> ')
end=input('input end >> ')

#��üó��
i=beg
while i<=end:
    print i,
    i=i+1
print

#����ó��
i=beg
while i<=end:
    if i%5==0:
        print i,
    i=i+1
print


#�߰�ó��
i=beg
while i<=end:
    if i%5==0:
        print i,
        break
    i=i+1
print

