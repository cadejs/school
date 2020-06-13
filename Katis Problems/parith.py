import sys
def main():
    for line in sys.stdin:
        carries=0
        num1,num2 = line.split()
        if num1 == '0' and num2 == '0':
        break
      list1 = [int(x) for x in str(num1)] 
      list2 = [int(x) for x in str(num2)] 
      counter = len(list1)
      for item in reversed(list1):  
        if counter==0:
          break
        if list1[counter-1]+list2[counter-1] > 9:
          carries+=1
          list1.insert(counter, item+1)
        counter-=1
      if carries == 0:
        print("No carry operation.")
      if carries == 1:
        print("1 carry operation.")
      if carries > 1:
        print(carries,"carry operations.")

main()
