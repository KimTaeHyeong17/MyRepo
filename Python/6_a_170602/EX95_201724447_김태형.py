def section(n,ch):
    i=0
    while i<n:
        print ch,
        i=i+1
    return


def line(n1,n2,n3):
    section(n1,'.')
    section(n2,'*')
    section(n3,'.')
    print
    return


j=0
while j<10:
    n1=9-j
    n2=1+2*j
    n3=9-j
    line(n1,n2,n3)
    j=j+1

#실습문제
