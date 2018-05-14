#재귀호출(recrusive call, recursion)
#정의 : 함수의 자신에 대한 호출

def f(n):
    if n==0:
        return 1
    return n*f(n-1)    #calls self

v=input('integer >> ')
print f(v)


