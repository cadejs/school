#!/usr/bin/env python3
# -*- coding: utf-8 -*-

import sys

inpt = sys.stdin.readline()
letters = list(inpt)
letters.pop()
def printyboi(test):
    #line one/five 
    for i in range(0,len(test)):
     
        if i == 0:
            print('.', end='')
        if (i+1)%3==0:
            print('.*.', end='') 
        else:
            print('.#.', end='')
        print('.', end='')
    print()
      
    #line two and four  
    for i in range(0,len(test)):
        #print('.', end ="")
        if (i+1)%3==0:
            print('.*.*', end='')
        else:
            print('.#.#', end='')
    print('.')
    
    counter=0
    #middle line
    for i in range(len(test)):
#if index is 0
        if i == 0:
            print("#.",end='')
            print(test[counter],end='')
            counter=counter+1
            continue
        if i == 1:
            print('.#.',end='')
            print(test[counter],end='')
            counter=counter+1
            continue
        if (i-1)%3 == 0:
            print('.#.',end='')
            print(test[counter],end='')
            counter=counter+1
            continue
        if (i+1)%3==0:
            print('.*.',end='')
            print(test[counter],end='')
            counter = counter + 1
            continue
        if (i%3)==0:
            print('.*.',end='')
            print(test[counter],end='')
            counter=counter+1
            continue
   
    if((len(test)+1)%3): 
        #if we are on an item that is the third
        if len(test)%3==0 and len(test)>1:
            print('.*')
        else:
            print('.#')
 
    else:
        print('.#')
    #print()
  
    
    #line two and four  
    for i in range(len(test)):
        #print('.', end ="")
        if (i+1)%3==0:
            print('.*.*', end='')
        else:
            print('.#.#', end='')
    print('.')
    #line one/five 
    for i in range(len(test)):
        if i == 0:
            print('.', end='')
        if (i+1)%3==0:
            print('.*.', end='')
        else:
            print('.#.', end='')
        print('.', end='')
#h=list('abcdefghijklmnop')

printyboi(letters)