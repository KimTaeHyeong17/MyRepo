#EX 92

def sum(beg,end):
    s=0
    i=beg
    while i<=end:
        s=s+i
        i=i+1
    return s


beg = input('input start >> ')
end = input('input end >> ')

s=sum(beg,end)
print 'sum = ', s

