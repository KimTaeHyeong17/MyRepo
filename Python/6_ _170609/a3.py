#�ٶ����� ��ȯ��

def f(n):
    if n%2==0:
        return 'two'
    if n%3==0:
        return 'three'
    if n%2!=0 and n%3!=0:
        return 'other'
    #return NoneX None����-->�򰥸���.

v=input('integer >> ')
print f(v)

########################################################

def f(n):
    if n%2==0:
        return 'two'
    if n%3==0:
        return 'three'
    return 'other'  #-->�ٶ����ϴ�.(None�� ������������)


v=input('integer >> ')
print f(v)
################################################


def f(n):
    if n%2==0:
        return 'two'
    if n%3==0:
        return 'three'
    else:
        return 'other' #-->������ �ʴ�.
    #return None
v=input('integer >> ')
print f(v)
