import sys

#by the time we check these functions, the grid and the current indexes should all be (ints)
def checkright(currenti,currentj,grid):
    #input values are correct, the issue lies with the casting of the lists
    
    PrevRight = True
    return int(grid[currenti+1][currentj])

def checkdown(currenti,currentj,grid):
    return int(grid[currenti][currentj+1])

def gridify(array,length,height): 
    grid=[]
    lencounter=0
    fillcounter=0
    widthcounter=0
    depthcounter=0
    while lencounter < length:
        grid.append([])
        lencounter+=1

    while fillcounter< len(array):
        if widthcounter == length:
            depthcounter+=1
            widthcounter=0
        grid[depthcounter].append(array[fillcounter])
        widthcounter+=1
        fillcounter+=1    
    return grid
grid=[]
for inputline in sys.stdin:
    line = list(inputline.split())
    if len(line) < 4:
        N=int(line[0])
        currentI=int(line[1]) # this = (1,x) = start i
        currentJ=int(line[1]) # this = (x,1) = start j
        finalI=int(line[2])# this = (3,y) = final i
        finalJ=int(line[2])# this = (x,3) = final j
    else:
        
        grid+=line #fill the grid wih the inputline if the input line is bigger than 3


Time=0
PrevRight=False
while currentI < N-1 and currentJ < N-1:
    if checkright(currentI,currentJ,gridify(grid,N,N)) < checkdown(currentI,currentJ,gridify(grid,N,N)) and PrevRight==False:
        Time+=int(checkright(currentI,currentJ,gridify(grid,N,N)))
        PrevRight=True
        currentI+=1
    else:
        Time+= int(checkdown(currentI,currentJ,gridify(grid,N,N)))
        currentJ+=1
print(currentI,currentJ,finalI,finalJ,"Time taken",Time)