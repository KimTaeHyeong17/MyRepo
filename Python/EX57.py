def f(n):
    if v%7==0:
        return False
    return True


v=input('input a integer >> ')
if(not ((f(v)==True)!=False)):
    print v, 'is a multiple of 7'
else:
    print v, 'is not a multiple of 7'


#if문이 mutiple of 7이 되려면 True여야 되는데 not이 붙었으니 False가 되야되고
#(f(v)==True)!=False가 False 가 되려면 False!=False여야 되니까 f(v)==True가
#False가 되어야 하니 f(v)는 False 가 되어야 False==True는 False이다.
#그리서 def에서 7의 배수는 false를 리턴해야된다.
