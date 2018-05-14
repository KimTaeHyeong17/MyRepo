#program =반복문 1.전체 2,선택 3.발견
#        =함수 -함수화(easy)
#             -재귀함수 (hard)  1.점화식이 있는 재귀함수
#                              2.점화식이 없는 재귀함수




#점화식을 사용한 재귀호출
#5!=5*4*3*2*1
#f(n)=n*f(n-1),(n>0) --- 가속부
#    = 1,(n=0) --- 정지부

def f(n):
    if n==0:
        return 1  #  정지부 기술
    if n>0:
        return n*f(n-1)  #가속부 기술


v=input('integer >> ')
print f(v)




