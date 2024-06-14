#! /bin/bash
sum()
{
 a=$1
 b=$2
 result=$(($a+$b))
 echo "result is : $result"

}
sum 2 3 
read -p "enter first parameter " arg1
read -p "enter second parameter " arg2

sum $arg1 $arg2

echo "function with return type"
#function with return type

subtract()
{
 a=$1
 b=$2
 
 result=$(($a-$b))
 return $result
}

subtract 10 4
res=$?
echo "result is $res "
