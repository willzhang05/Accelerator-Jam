import os

files = [f for f in os.listdir('.') if os.path.isfile(f)]
print "Removed files:"
print "--------"
for f in files:
    try:
        if f[-6:] == ".class":
            print "   "+f
            os.remove(f)
    except IndexError:
        continue
print "--------"
pause = raw_input();
