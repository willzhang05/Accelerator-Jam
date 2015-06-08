echo -n "Enter remove to remove all .class files, or compile to compile all .java files: "
read input
if [ $input == "remove" ]
    then
        rm *.class
elif [ $input == "compile" ]
    then
        javac *.java
else
    echo "Invalid input"
    exit 1
fi