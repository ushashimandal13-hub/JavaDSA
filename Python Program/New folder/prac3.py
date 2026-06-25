print("Enter traffic mode: ")
light = input()
if(light == "red"):
    print("Stop")
elif(light == "yellow"):
    print("Look")
elif(light == "green"):
    print("Go")
else:
    print(" Traffic is broken ")