

def is_even1(n):
    if n%2==0:
        return True
    else:
        return False


print is_even1(4)
print is_even1(3)


#if문 만족시 결과값은 어차피 True인데 병신같이 True를 또 리턴하는


def is_even2(n):
    return n%2==0


print is_even2(4)
print is_even2(3)


