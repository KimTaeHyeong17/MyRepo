def f(n):
    if v%7==0:
        return False
    return True


v=input('input a integer >> ')
if(not ((f(v)==True)!=False)):
    print v, 'is a multiple of 7'
else:
    print v, 'is not a multiple of 7'


#if���� mutiple of 7�� �Ƿ��� True���� �Ǵµ� not�� �پ����� False�� �Ǿߵǰ�
#(f(v)==True)!=False�� False �� �Ƿ��� False!=False���� �Ǵϱ� f(v)==True��
#False�� �Ǿ�� �ϴ� f(v)�� False �� �Ǿ�� False==True�� False�̴�.
#�׸��� def���� 7�� ����� false�� �����ؾߵȴ�.
