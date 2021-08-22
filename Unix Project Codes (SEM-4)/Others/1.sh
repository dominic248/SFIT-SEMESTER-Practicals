#!/bin/bash
echo -n "Enter size of N for NxN matrix: "
read n 
for ((i=0; i<n; i++)); do
	for ((j=0;j<n;j++)); do
		echo -n "Enter value for N[$((i+1))$((j+1))]: "
		read a[$((i*n+j))]
	done
done
for ((i=0; i<n; i++)); do
	for ((j=0;j<n;j++)); do
		printf "%d" ${a[$((i*n+j))]}
		echo -n " "
	done
	echo ""
done
for ((i=0; i<n; i++)); do
    sum=0
    for ((j=0; j<n; j++)); do              
        sum=$((sum + a[$((i*n+j))]))    
        sum=$((sum - a[$((i*n+j))]))   
        if [ ${a[$((i*n+j))]} -le $sum ]
        then
            echo "NO"
            exit  
    	fi
    done  
done
echo "YES"  

