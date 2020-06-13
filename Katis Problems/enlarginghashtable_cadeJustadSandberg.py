#!/usr/bin/env python

'''
Created on Aug 26, 2019

@author: CadeJustadsandberg
'''
import sys

def main():
    for line in sys.stdin.readlines():
        for x in line:
            print (x)
            
main()
        