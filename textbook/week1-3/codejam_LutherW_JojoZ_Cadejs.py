'''
Created on Sep 12, 2019

@author: CadeJustadsandberg
'''
import sys
msg = 'welcome to code jam'
lastletter='m'

def msg_counter(sentence,msg, start=0):
    #print("inside msg counter",str(sentence))
    counter = 0
# if start is equal to the end of the message
    if start == len(msg) - 1:
        for char in sentence:
            if char == lastletter:
               counter += 1
        return counter
# if we are not at the last letter, call the function again and go 
#up by one positon in the string
    for char in enumerate(sentence):
    # if the first char equals the new index start+=1 only if each character matches does this if statement keep running
        if char[1] == msg[start]:
#sentence is returned back into the function with an index+1
            counter += msg_counter(sentence[char[0] + 1:], msg, start + 1)
    return counter


#for each msg in the input
casecount=0
finalsub=''
sentences=[]

for test in sys.stdin:
    if casecount > 0:
        substrings = msg_counter(test,msg)
        sublist= list(str(substrings))
        zfillremove= 4-len(sublist)
        finallist=list(finalsub.zfill(zfillremove))
        finallist.append(substrings)
        print("Case","#%s:" % (casecount),"".join(map(str, finallist)))
    casecount+=1
    