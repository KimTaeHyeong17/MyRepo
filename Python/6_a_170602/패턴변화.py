beg=input('input beg >> ')
end=input('input end >> ')


i=beg
while i<=end:
    if i%5==0:  
        break
    i=i+1

if i%5==0:
    print 'found :',i
print




beg=input('input beg >> ')
end=input('input end >> ')


i=beg
while True:
    if not (i<=end and not(i%5==0)): 
        break
    i=i+1

if i%5==0:
    print 'found :',i
print





