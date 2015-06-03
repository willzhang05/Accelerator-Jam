#!/bin/bash

javac *.java
jar cfvm Accelerator-Jam.jar manifest.mf *.class 
