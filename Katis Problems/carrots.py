'''
Created on Aug 26, 2019

@author: CadeJustadsandberg
'''

import sys

def carrot():
    carrotinput = sys.stdin.readline()
    input2 = carrotinput.split()
    print(input2[1])
    return input2[1]

carrot()