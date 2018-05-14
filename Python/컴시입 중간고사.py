
seq=input('input a list >> ')
s=0
for ai in range(0,len(seq)):
    if seq[ai]<0:
        print ai,
    if seq[ai]>0:
        s=s+ai 
print '\nsum of positive = ', ;print s
