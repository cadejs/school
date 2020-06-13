#! /usr/bin/env python3
""" CSCI 235 program to list files """
import sys
import os
size =0
if len(sys.argv) == 1:
    print("{0}: need a argument")
    sys.exit(1)
DIR_NAME = sys.argv[1]
if not os.path.isdir(DIR_NAME):
    print("{0}: {1} is not a direcotry".format(sys.argv[0], DIR_NAME))
for dir_path, dir_names, file_names in os.walk(DIR_NAME, followlinks=False):
    for file_name in file_names:
        if os.path.getsize(os.path.join(dir_path, file_name)) > size:
            # size = os.path.getsize(os.path.join(dir_path, file_name))
            print(os.path.getsize(os.path.join(dir_path, file_name)))
            size = (os.path.getsize(os.path.join(dir_name, file_name)))
            # print(os.path.getsize(os.path.join(dir_path, file_name)))