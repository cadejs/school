'''
@authors: Luther W, Cade J, Josephine Z
'''
#says it takes to long

import sys

bitlength = sys.stdin.readline().split()
bitlength = int(bitlength[0])
finalBYTE=str(0)
finalBYTE=finalBYTE.zfill(bitlength)
bitList = [int(x) for x in str(finalBYTE)] 

def bitFlip(value,bitList):
    counter=0;
    if bitList[value]==0:
        bitList[value]=1
    else:
        bitList[value]=0
            
    return bitList[value]

def bitCount(start,end,bitList):
    numOnes=0 
    while start<=end:
        if bitList[start-1]==1:
            numOnes+=1
        start+=1
    print(numOnes)


counter = 0
input = sys.stdin
for i in input:
    input = i.replace(' ','')
    input = list(input)
    input.pop()
    input=[int(x) for x in input if x!= 'C' and x!='F']

    if len(input) == 1:
        bitList[input[0]-1]=bitFlip(input[0]-1,bitList)
    if len(input) > 1:
        start = input[0]
        end = input[1]
        bitCount(start,end,bitList)
    counter +=1