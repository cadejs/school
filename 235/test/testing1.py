'''
Created on Apr 29, 2019

@author: CadeJustadsandberg
'''

#! /usr/bin/env python3
""" CSCI 235 program to list files """
import sys
import os
if len(sys.argv) == 1:
    print("{0}: need a argument")
    sys.exit(1)
DIR_NAME = sys.argv[1]
if not os.path.isdir(DIR_NAME):
    print("{0}: {1} is not a direcotry".format(sys.argv[0], DIR_NAME))
for dir_path, dir_names, file_names in os.walk(DIR_NAME, followlinks=False):
    for file_name in file_names:
        if 
        print(os.path.join(dir_path, file_name))

