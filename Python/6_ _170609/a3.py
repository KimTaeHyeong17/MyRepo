#바람직한 반환값

def f(n):
    if n%2==0:
        return 'two'
    if n%3==0:
        return 'three'
    if n%2!=0 and n%3!=0:
        return 'other'
    #return NoneX None없음-->헷갈린다.

v=input('integer >> ')
print f(v)

########################################################

def f(n):
    if n%2==0:
        return 'two'
    if n%3==0:
        return 'three'
    return 'other'  #-->바람직하다.(None을 리턴하지말자)


v=input('integer >> ')
print f(v)
################################################


def f(n):
    if n%2==0:
        return 'two'
    if n%3==0:
        return 'three'
    else:
        return 'other' #-->나쁘지 않다.
    #return None
v=input('integer >> ')
print f(v)
