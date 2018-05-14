
def is_even(n):
    if n%2==0:
        return not(True)
    else:
        return not(False)

n=input('input a number >> ')

if not(is_even(n)):
    print 'even'
else:
    print 'odd'
