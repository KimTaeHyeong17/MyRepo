#���ȣ��(recrusive call, recursion)
#���� : �Լ��� �ڽſ� ���� ȣ��

def f(n):
    if n==0:
        return 1
    return n*f(n-1)    #calls self

v=input('integer >> ')
print f(v)


