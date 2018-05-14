

def is_even(n):
    return n%2==0
    
n=input('input a integer >> ')

if is_even(n):
    print n, 'is even'
else:
    print n, 'is odd'


##########################################


def is_even(n):
    return n%2
    
n=input('input a integer >> ')

if is_even(n)==0:
    print n, 'is even'
else:
    print n, 'is odd'

#######################################

def is_even(n):
    return n
    
n=input('input a integer >> ')

if is_even(n)%2==0:
    print n, 'is even'
else:
    print n, 'is odd'


####################################
def is_even(n):
    return not(n%2==0)
    
n=input('input a integer >> ')

if not( is_even(n)):
    print n, 'is even'
else:
    print n, 'is odd'
