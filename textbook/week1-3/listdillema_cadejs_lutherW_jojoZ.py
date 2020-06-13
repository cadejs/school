import sys

i = 0 
def instructions(address,x):
    if address[0] == '0':
        if address[1]=='0':
            print("empty register, no operation")
            #continue
    if address[0] == '1':
        print("halt",address)
        x+=1
        break
    if address[0] == '2':
        address[1]=address[2]
        print(address)
        x+=1
        break
    if address[0] == '3':
        address[1]=(int(address[1])+int(address[2])%1000)
        print(address)
        x+=1
        break
    if address[0] == '4':
        address[1]=(int(address[1])*int(address[2])%1000)
        print(address)
        x+=1
        break
    if address[0] == '5':
        address[1]=address[2]
        print(address)
        x+=1
        break
    if address[0] == '6':
        address[2]=address[1]
        print(address)
        x+=1
        break
    if address[0] == '7':
        address[1]=(int(address[1])*int(address[2])%1000)
        print(address)
        x+=1
        break
    if address[0] == '8':
        address[1]=address[2]
        print(address)
        x+=1
        break
    if address[0] == '9':
        address[2]=address[1]
        print(address)
        x+=1
        break
    print("executions",x) 
    return x

while i <1000 and sys.stdin: 
    registers = list(sys.stdin.readline())
    if not registers:
        break
    registers.pop()
    if registers[0]==1:
        i+=1
        break
    i+=instructions(registers,i)
print(i)