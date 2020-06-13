#not working, getting odd error 

import sys
from itertools import permutations 


def generatedindexes(array):
    indexDistances=[]
    indexcounter=0
    for number in newline:
        indexcounter+=1
        if indexcounter < len(newline)-1:
            if newline[indexcounter+1]-newline[indexcounter] > 0:
                indexDistances.append('1')
            if newline[indexcounter+1]-newline[indexcounter] < 0:
                indexDistances.append('-1')
            else:
                indexDistances.append('0')
    return indexDistances
        # compare item to item+1 see if you get a +1 or 0 or -1
        # if its bigger it gets a +1
        #[-1,0,1,0]
        #perm --> [0,-1,0,1]

def sequentialDistances(indexDistances, permutation):
    timesMatched=0
    #build relationship in the permutation
    if generatedindexes(permutation) == indexDistances: #might work if it compares every index
        timesMatched+=1
        sequentialDistances(line,permutation)
    else:
    
        sequentialDistances(line,permutation)
    
    return timesMatched
for line in sys.stdin:
    newline=line.split()
    print('line',newline)
    #line=line.pop()
    
    if len(newline)<2:
        treelength = newline
        print("treelength",treelength)

    else:
        #TUTOR'S ADVICE: find some pattern at the beginning based on the numbers that will generate the tree. If you don't see the pattern kick out that permutation, making a tree of each one is too slow
            
        #newline=list(str(newline).split())
        newline = [int(x) for x in newline]
        
        print('.............')
        
        allpermutations = permutations(newline) 
        for permutation in allpermutations:
            sequentialDistances(generatedindexes(newline),permutation)