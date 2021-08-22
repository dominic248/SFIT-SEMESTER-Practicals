#!/bin/sh
while true
do
	clear
	echo -n "\nEnter number of lines: "
	read p
	if ! [ "$p" -eq "$p" ] 2> /dev/null
	then
		echo "$p is not an integer!"
	else
		m=1
		while [ $m -lt $p -o $m -eq $p ]
		do
			a=$m
			while [ $a -lt $p -o $a -eq $p ]
			do
				echo -n " "
				a=$((a+1))
			done	
			n=1 
			while [ $n -lt $((m-1)) -o $n -eq $((m-1)) ]
			do
				echo -n "*A"
				n=$((n+1))
			done
			echo -n "*"
			i=1
			while [ $i -lt $m ]
			do
				echo -n " "
				i=$((i+1))
			done
			echo ""
			m=$((m+1))
		done
		while(true)
		do
			echo -n "\n1.Continue\n2.Exit\nEnter your choice: "
			read a
			if [ $a -eq 2 ]
			then
				exit
			elif [ $a -eq 1 ]
			then	
				break
			else
				echo "Enter a valid choice!"
			fi
		done
	fi
done
