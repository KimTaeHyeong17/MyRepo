def calc(num):

    sum1=0
    for i in range(1,num):
        for j in range(1,i):
            index=1
            if num == index:
                break
            else :
                sum1+=j
                index+=1
            print sum1, index    
    return sum1
    

inp=raw_input().split()
print calc(int(inp[1]))-calc(int(inp[0])-1)
