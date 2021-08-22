#!/bin/sh
while true
do
	echo -n "\nEnter number of lines: "
	read p
	if ! [ "$p" -eq "$p" ] 2> /dev/null
	then
		echo "$p is not an integer!"
	else
		m=1
		while [ $m -le $p ]
		do
			a=$m
			while [ $a -le $p ]
			do
				echo -n " "
				a=$((a+1))
			done	
			n=1 
			while [ $n -le $m ]
			do
				echo -n "*"
				n=$((n+1))
			done
			
			echo ""
			m=$((m+1))
		done
        m=$p
        while [ $m -ge 1 ]
		do
			a=$((m-1))
			while [ $a -le $p ]
			do
				echo -n " "
				a=$((a+1))
			done	
			n=1 
			while [ $n -lt $m ]
			do
				echo -n "*"
				n=$((n+1))
			done
			
			echo ""
			m=$((m-1))
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
