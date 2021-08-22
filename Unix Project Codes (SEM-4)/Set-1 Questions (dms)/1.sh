#!/bin/sh
echo -n "Enter first number: "
read first
echo -n "Enter second number: "
read sec
echo -n "Enter third number: "
read third
if ! [ "$first" -eq "$first" ] 2> /dev/null
then
	echo "$first is not an  integer!"
	exit
fi
if ! [ "$sec" -eq "$sec" ] 2> /dev/null
then
	echo "$sec is not an integer!"
	exit
fi
if ! [ "$third" -eq "$third" ] 2> /dev/null
then
	echo "$third is not an integer!"
	exit
fi
if [ $first -gt $sec ]
then
	if [ $first -gt $third ]
    then
		echo "$first is the greatest number."
	else
		echo "$third is the greatest number."
	fi
else
	if [ $sec -gt $third ]
    then
		echo "$sec is the greatest number."
	else
		echo "$third is the greatest number."
	fi
fi