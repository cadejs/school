import sys
counter=1

#marbles not updating every loop it goes around as it is supposed to so second iteration it does not add any more marbles to itself


nodes=[]
marbles=[]
vertices=[]
inputs = sys.stdin.read().split('\n') 

for item in inputs: # for every item we read in
    
    if item[0]=='0': #break if zero
        break
    if len(item) < 2: #becomes the number of verts
        vertcount=item
    if len(item) > 1: #if bigger than one we make it a list for analyzing 
        nodes.append(item)

    

for node in nodes: #for every line in the input we make it into its own list
    
    node = node.replace(" ","")
    node = list(node)
    
    
    #vertices.append(node[0]) list of all the verts in the first column
    marbles.append(node[1]) #list of all the marbles in the second column of the input
i=0
counter=0
depth=0
children=''
for item in nodes:
    item = item.replace(" ","")
    item = list(item)
    
for node in nodes:
    node = node.replace(" ","")
    if int(node[2]) > 0: #if the spot in column three is not 0 it equals the children length
        
        while i < int(node[2]): #adds as many children as are listed in NODE[2]
            children+=node[2+(i+1)]
            children.replace(' ','')
            i+=1

        vertices.append(list(children))
        children=''
        i=0

#PRINT THE VERTEX AND ITS CHILDREN
print("lilvertz",vertices)    
print('.........')

#once we have all the verts and their children we can make another 2d array to associate the amount of marbles in each of them to start then test moving them around

#process for moving marbles:
    #1. align marbles with their vertex origin
finalmarbles=[]
marbs=''
count=0
print("marbles to line up",marbles)
for node in nodes: