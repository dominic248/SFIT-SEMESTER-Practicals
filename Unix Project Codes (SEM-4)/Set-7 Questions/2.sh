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
        echo "*"
		while [ $m -le $p ]
		do	
			
			echo -n "*"
				
            k=1 
            while [ $k -le $m ]
            do
                echo -n $k
                k=$(( k + 1 ))
            done
            l=$(( m - 1 ))
            while [ $l -ge 1 ]
            do
                echo -n $l
                l=$(( l - 1 ))
            done
           
			echo -n "*"
			
			echo ""
			m=$((m+1))
		done  
        m=$p
        while [ $m -ge 2 ]
		do	
			
			echo -n "*"
				
            k=1 
            while [ $k -le $((m-1)) ]
            do
                echo -n $k
                k=$(( k + 1 ))
            done
            l=$(( m - 2 ))
            while [ $l -ge 1 ]
            do
                echo -n $l
                l=$(( l - 1 ))
            done
           
			echo -n "*"
			
			echo ""
			m=$((m-1))
		done
        echo "*"
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
