
#점화식 없는 재귀호출(양쪽으로 갈라짐)


def f(ls,beg,end,v):  #[beg,end)
    if not(beg<end):
        return end #not[beg,end)
    m=(beg+end)
    if ls[beg]==v:
        return beg

#    [beg,m)
    retv=f(ls,beg,m,v)
    if beg<=retv and retv<m:
        return retv
#    [m+1.end)
    retv=f(ls,m+1,end,v)
    if m+1<=retv and retv<end:
         return retv

    return end
    

    
#    0  1  2  3  4  5  6
ls=[66,11,22,55,77,33,44]

beg=0
end=len(ls)
retv = f(ls,beg,end,99)
if beg<=retv and retv<end:
    print 'found'
else:
    print 'not found'
