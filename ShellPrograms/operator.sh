#!/bin/bash

num1=5
num2=3

result=$num1+$num2
echo "result of add %result"

read result1=$(( $num1+num2))
echo "result is %result1"

