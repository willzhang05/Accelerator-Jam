f = raw_input("Vehicle name: ")
f+=".vehicle"
vFile = open(f, "w")

var = raw_input("width: ")
vFile.write("width ")
vFile.write(str(var)+"\n")

var = raw_input("height: ")
vFile.write("height ")
vFile.write(str(var)+"\n")

var = raw_input("acceleration: ")
vFile.write("acceleration ")
vFile.write(str(var)+"\n")

var = raw_input("minSpeed: ")
vFile.write("minSpeed ")
vFile.write(str(var)+"\n")

var = raw_input("topSpeed: ")
vFile.write("topSpeed ")
vFile.write(str(var)+"\n")

var = raw_input("topHandlingSpeed: ")
vFile.write("topHandlingSpeed ")
vFile.write(str(var)+"\n")

var = raw_input("minHandlingSpeed: ")
vFile.write("minHandlingSpeed ")
vFile.write(str(var)+"\n")

var = raw_input("imagePath: ")
vFile.write("imagePath ")
vFile.write("\\Resources\\Vehicles\\" + str(var)+"\n")

var = raw_input("\n\n[Action Complete]")

vFile.close()
