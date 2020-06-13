'''
Created on Aug 28, 2019

@author: CadeJustadsandberg
'''

from __builtin__ import True, False
from itertools import count
from Carbon.Aliases import true, false

#hey fam all this needs in an input to run main (lower number, higher number)


def unique(num):
    numlist = [int(x) for x in str(num)]
    for i in range(0,(len(numlist))):
        if numlist[i] == 0:
            return False 
            break
        if numlist.count(numlist[i]) !=1:
            return False
            break
    #print("unique")
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
        #print(i)
        if unique(i) == True:
            if divisible(i) == True:
                counter+=1
                i = i+1
        i=i+1
    print (counter)

#main(200000, 300000)
#main(123864,123865)
#main(198765, 198769)

# below are test cases
#main(123864,123865)
#main(200000,300000)
#divisible(123865)  
#print(divisible(123864))
#print(divisible(123865))
#print(divisible(123866))
#print(divisible(201346))
#print(unique(123864))
#print(unique(123865))
#print(unique(123866))
#print(unique(201346))   
        
        
        
        
