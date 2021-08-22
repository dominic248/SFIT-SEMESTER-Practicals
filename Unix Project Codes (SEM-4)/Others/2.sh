#!/bin/sh
i="y"
while [ "$i" = "y" ]
do
	echo "a. Square of a number"
    	echo "b. Square Root a number"
    	echo "c. Nth power of a number"
    	echo "d. Nth root of a number"
    	echo "e. Quit"
    	read ch
    	case "$ch" in
        	"a") echo "Enter a number"
          	read a
          	sq=`expr $a \* $a`
          	echo "The square of $a = $sq";;
        	"b") echo "Enter first number"
          	read c
          	d=$(echo "sqrt($c)" | bc -l)
          	echo "$d";;
        	"c") echo "Enter a number"
          	read n
          	echo "Enter a the power of the number"
          	read m
		i=1
		pow=n
		while [ $i -lt $m ]
		do
			pow=$(( $pow * $n ))
			i=$((i+1))
		done 
          
          	echo "$n ^ $m"        
          	echo "The Nth power of the number is : $pow";;
        	"d") echo "Enter a number"
          	read x
          	echo "Enter a number"
          	read n
          	d=$(echo "e( l($x)/$n )" | bc -l)
		echo "$d";;
        	"e") exit;;
        	*) echo "Enter valid choice"
    	esac
    	echo "Do you want to continue?"
    	read i
    	if [ $i != "y" ]
    	then
        	exit
    	fi
done
