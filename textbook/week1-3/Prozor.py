'''
Created on Sep 10, 2019

@author: CadeJustadsandberg
'''
import sys

#row,collum,racket  = sys.stdin.readline().split
#[int(x) for x in _____,]
#list(map(int,_____))

#rows,collum,racket = list(map(int,sys.stdin.readline().split))
rows,collum,racket = sys.stdin.readline().split
window = []
for i in range(rows):
    window.append(list(sys.stdin.readline().rstrip()))

for i in range(rows-racker+1):
    for j in range(collum,racket):
        
        #range(i+1,i+racket-1)
count = 0
print(count)
for i in range(rows):
    print("".join(window[i]))
    
