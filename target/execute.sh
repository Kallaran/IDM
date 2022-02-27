#!/bin/bash
if [ -z "$1" ]
then
    echo "No program file supplied"
else
    java -jar python.jar "progs/$1"
    python3 src-gen/file.py
    sleep 100000
fi

