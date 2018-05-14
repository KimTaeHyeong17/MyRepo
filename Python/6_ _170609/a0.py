#바람직한 반환값

def f(n):
    if n%2==0:
        return 'two'
    if n%3==0:
        return 'three'
    if n%5==0:
        return 'five'
#    return None 생략간주 

v=input('integer >> ')
print f(v)

