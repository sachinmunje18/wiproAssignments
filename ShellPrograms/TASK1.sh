#!/bin/bash

filecheck()
{
file="$1"
if [ -e $file ]
then
echo "File exists"
else
echo "File Not Found!"
fi
}

read -p "Enter the File Name : " filename
filecheck $filename
