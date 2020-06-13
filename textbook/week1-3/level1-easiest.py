'''
Created on Sep 9, 2019

@author: CadeJustadsandberg, Luther W, Jojo Z
'''

#https://open.kattis.com/problems/easiest

import sys
m=10
sumM=0
sumN=1
for item in sys.stdin:
    if str(item)=='0' or int(item)==0:
        break
    while sumM!=sumN:
        N=item
        m=m+1
        product=int(N)*m
        sumN = list(N)
        sumN.pop()
        sumN=sum(map(int,sumN))
        sumM=list(str(product))
        sumM=sum(map(int,sumM))
    print(m)
    m=10
    sumM=1
    sumN=0
