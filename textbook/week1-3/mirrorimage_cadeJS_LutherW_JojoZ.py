
'''
Author: Josephine Zenker, Cade Justad-Sandberg, Luther Wardle
Problem: Mirror Images 
Difficulty: 1.7
'''

import sys 
#T is the number of test cases 
T = int(sys.stdin.readline().strip()) #strip off new line before cast to int 


#R is the number of rows, C is the number of columns 
def testCase(): 
    rCString = sys.stdin.readline().strip() 
    R, C = map(int, rCString.split(' ')) #return a list of two ints 
    
    output = [] 
    
    for i in range(R): #While number of lines is < R, exclusive 
        if i > 0: 
            #puts \n character in front of list, at position 0
            output.insert(0, '\n') #0 is where to insert and '\n' inserting into list 
            
            
            
        line =  sys.stdin.readline().strip()
        for j in range(C):
            output.insert(0, line[j]) #mirror L to R, this will appear ahead of new line character 
    return ''.join(output) #join appears between elements 


for i in range(T):
    test = testCase() #output is stored in here 
    print('Test {0}'.format(i+1))
    print(test)
    
