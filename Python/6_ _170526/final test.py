

def is_even(n):
    if not(n%2==0):
        return True
    else:
        return False


n=input('input a integer >> ')

if not(is_even(n)):
    print n, 'is even'
else:
    print n, 'is odd'


