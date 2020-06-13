'''
@author: CadeJustadsandberg, Luther Wardle, Josephine Z
'''

#I turned it into a long array, however it could be done as an that only stores [light location, red light, green light] 
#and is only as long as the number of lights, however I don't think we need to do that right now
import sys
for item in sys.stdin:
    inputval= item.split()
    print(inputval)
    if len(inputval) < 3:
        N=inputval[0]
        L=int(inputval[1])
        road=[]
        print("we are in the if statement")
        while len(road) < L:
            road.append([0,0])
        print("road",road)
    else:
        print("we are in the else statement")
        lightlocation=int(inputval[0])
        redint = int(inputval[1])
        greenint = int(inputval[2])
        road[lightlocation] = [redint,greenint]
        print(lightlocation,redint,greenint)
    print(inputval,N,L)
    

def main():
    dtrvl = 0 #update each time you move
    time = 0 #update each time step
    numlight = 0 #update on input,  this could be used to reduce how long it runs in some cases but not really important
    lightpassed = 0 #update when you pass a light 
    while dtrvl < L:
            #run while you havent gotten all the way down the road
            if road[dtrvl] != [0,0]:
                if time < (road[dtrvl][0]+road[dtrvl][1]):  #TIME IS BIGGER THAN THE ADDED VALUES SO THE WHILE LOOP REPEATS 
                    if (road[dtrvl][0]+road[dtrvl][1])-time > road[dtrvl][0]:  #if red light time has passed
                        time+=1
                        dtrvl+=1
                        lightpassed =lightpassed +1
                    else:
                        time+=1 #stuck at the red light, now goes back up
                        break
                else:
                    if time%(road[dtrvl][0]+road[dtrvl][1])>road[dtrvl][0]:  #remainder method minus redlight time to see if stopped
                        print("time",time,"final val",time%(road[dtrvl][0]+road[dtrvl][1]),road[dtrvl][0])
                        time+=1
                        dtrvl+=1
                    else:
                        print("time goes up by one") #final output happening in sample test 2
                                                     #dtrvl is never going up in this case, so the loop goes on forever
                        time+=1
            else:
                time+=1
                dtrvl+=1
    print(time)

main()