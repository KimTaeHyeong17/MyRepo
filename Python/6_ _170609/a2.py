#���ȣ��(recrusive call, recursion)
#���� : �Լ��� �ڽſ� ���� ȣ��


def f(n):
    if n%2==0:
        return 'two'
    if n%3==0:
        return 'three'
    if n%5==0:
        return 'five'
#    return None

v=input('integer >> ')
print f(v)

