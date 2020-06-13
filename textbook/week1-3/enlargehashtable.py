'''
Created on Aug 28, 2019

@author: CadeJustadsandberg
'''
# from __builtin__ import False

def isprime(num):
    if num > 1:
        for i in range(2,num):
            if (num%i)==0:
                #print(num, "is not a prime number")
                return False
                break
        else:
            #print(num, "is a prime number")
            return True
        

def enlarge(num):
    worknum=num*2
    while isprime(worknum) == False:
        worknum+=1
    
    if isprime(num)==True:
        print (worknum, num ," is a prime number")
    else:
        print (worknum)

enlarge(6)
                    