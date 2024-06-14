#! /bin/bash

#function defination
great(){
echo "hello world"
}
#function with parameter 
sum()
{
 a=1
 b=2
 result=$(($a+$b))
 echo "result of sum : $result"
}
sum
great

