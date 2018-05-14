y=input('Input a number >> ')

if y%4==0 and y%100!=0 or y%400==0:
    print 'leap'
else:
    print 'not leap'
