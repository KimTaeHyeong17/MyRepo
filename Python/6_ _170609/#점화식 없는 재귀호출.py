
#점화식 없는 재귀호출


def f(ls,beg,end,v):  #[beg,end)
    if not(beg<end):
        return -1  #not[beg,end)
    if ls[beg]==v:
        return beg
    return f(ls,beg+1,end,v)

    
#    0  1  2  3  4  5  6
ls=[66,11,22,55,77,33,44]

beg=0
end=len(ls)
retv = f(ls,beg,end,99)
if beg<=retv and retv<end:
    print 'found'
else:
    print 'not found'
