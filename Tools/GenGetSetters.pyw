from Tkinter import *

root = Tk()

def make():
    myVar = varEntry.get()
    myUpp = myVar[0].upper()+myVar[1:]
    myType = typeEntry.get()
    myTabs = int(tabsEntry.get())
    myLevel = int(levelEntry.get())

    rStr = " " * (myLevel *  myTabs)
    rStr += "public "+myType+" get"+myUpp+"(){\n"
    rStr += " " * ((myLevel+1) *  myTabs)
    rStr += "return "+myVar+";\n"+(" " * (myLevel *  myTabs))+"}\n\n"
    rStr += " " * (myLevel *  myTabs)
    rStr += "public void set"+ myUpp +"("+myType+" new"+myUpp+"){\n"
    rStr += " " * ((myLevel+1) *  myTabs)
    rStr += myVar+" = new"+myUpp+";\n"+(" " * (myLevel *  myTabs))+"}\n\n"
    root.clipboard_clear()
    root.clipboard_append(rStr)

root.overrideredirect(True)
size = root.winfo_screenwidth(), root.winfo_screenheight()
geo = "140x130+"+str(size[0]-140)+"+40"
root.geometry(geo)

varLabel = Label(root, text = "Var:")
varLabel.grid(row = 0, column = 0)
varEntry = Entry(root)
varEntry.grid(row = 0, column = 1)

typeLabel = Label(root, text = "Type:")
typeLabel.grid(row = 1, column = 0)
typeEntry = Entry(root)
typeEntry.grid(row = 1, column = 1)

tabsLabel = Label(root, text = "Tab:")
tabsLabel.grid(row = 2, column = 0)
tabsEntry = Entry(root)
tabsEntry.grid(row = 2, column = 1)

levelLabel = Label(root, text = "Indents:")
levelLabel.grid(row = 3, column = 0)
levelEntry = Entry(root)
levelEntry.grid(row = 3, column = 1)

copyButton = Button(root, text = "Copy", width = 22, height = 2, command = make)
copyButton.grid(row = 4, column = 0, columnspan = 2)

root.mainloop()
getSetVariable = raw_input("Keyword to generate for: ")

uppercaseVersion = getSetVariable[0].upper()+getSetVariable[1:]
print "public int get"+uppercaseVersion+"(){"
print "    return "+getSetVariable+";\n}\n\n"
print "public void set"+uppercaseVersion+"(int new"+uppercaseVersion+"){"
print "    " +getSetVariable+" = new"+uppercaseVersion+";\n}"
