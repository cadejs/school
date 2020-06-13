'''
Created on Sep 6, 2019

@author: CadeJustadsandberg, Luther Wardle, Josephine Z
'''

#take in N(number of lights) and take in D(the total distance)
#run a loop N times for the input stream


#below you will see Luther's excellent and crafty method for bringing in the data

#I turned it into a long array, however it could be done as an that only stores [light location, red light, green light] 
#and is only as long as the number of lights, however I don't think we need to do that right now
import sys
for item in sys.stdin:
    inputval= item.split()
    if len(inputval) < 3:
        N=inputval[0]
        L=inputval[1]
        road = [[0,0]*L]
    else:
        lightlocation=inputval[0]
        redint = inputval[1]
        greenint = inputval[2]
        road[lightlocation] = [redint,greenint]
        #print(lightlocation,redint,greenint)
    #print(inputval,N,L)
    

def main():
    dtrvl = 0 #update each time you move
    time = 0 #update each time step
    numlight = 0 #update on input,  this could be used to reduce how long it runs in some cases but not really important
    lightpassed = 0 #update when you pass a light 

    while dtrvl < L:
        #run while you havent gotten all the way down the road
        if road[dtrvl] != [0,0]:
            if time < (road[dtrvl][0]+road[dtrvl][1]):  #edge case where % method does not work
                if (road[dtrvl][0]+road[dtrvl][1])-time > road[dtrvl][0]:  #if red light time has passed
                    time+=1
                    dtrvl+=1
                    lightpassed =lightpassed +1
                else:
                    time+=1 #stuck at the red light, now goes back up
            else:
                if time%(road[dtrvl][0]+road[dtrvl][1])>road[dtrvl][0]:  #remainder method minus redlight time to see if stopped
                    time+=1
                    dtrvl+=1
                else:
                    time+=1
        else:
            time+=1
            dtrvl+=1
    print(time)

main()