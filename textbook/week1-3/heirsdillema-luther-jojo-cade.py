'''
Created on Sep 3, 2019

@author: CadeJustadsandberg
'''
import sys
def unique(num):
    numlist = [int(x) for x in str(num)]
    for i in range(0,(len(numlist))):
        if numlist[i] == 0:
            return False 
            break
        if numlist.count(numlist[i]) !=1:
            return False
            break
    return True
def divisible(num):
    numlist = [int(x) for x in str(num)]
    for i in range(0,(len(numlist))):
        if num%numlist[i]!=0:
            return False
    return True
def main(lower,upper):
    counter = 0
    for i in range(lower,upper):
        if unique(i) == True:
            if divisible(i) == True:
                counter+=1
                i = i+1
        i=i+1
    print (counter)
input1,input2 = list(sys.stdin.readline().split())
main(int(input1), int(input2))