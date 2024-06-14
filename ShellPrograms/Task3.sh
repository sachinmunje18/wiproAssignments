#!/bin/bash

count()
{
file="$1"

if [[ -e $file ]]
then
lines=$(wc -l < "$file")
words=$(wc -w < "$file")
echo "The file $file has $lines lines."
echo "Words are : $words"
else
echo "The file $file does not exist."
fi
}

read -p "Enter the File name : " filename
count $filename
