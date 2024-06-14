#! /bin/bash

sum()
{
 echo "inside the sum function"
 return 10
}
sum
result=$?
echo "result is $result"
