#!/bin/bash
echo -n "Enter size of matrix NxN: "
read n
i=0
while [ $i -lt $n ]
do
	j=0
	while [ $j -lt $n ]
	do
		echo -n "Enter value for N[$((i+1))$((j+1))]: "
		read a[$((i*n+j))]
		j=$(( j + 1 ))
	done
	i=$(( i + 1 ))
done 
echo "The entered Matrix is:"
i=0
while [ $i -lt $n ]
do
	j=0
	while [ $j -lt $n ]
	do
		echo -n "${a[$((i*n+j))]} "
		j=$(( j + 1 ))
	done
	i=$(( i + 1 ))
	echo ""
done 
max_xor=0
i=0
while [ $i -lt $n ]
do
	r_xor=0
	c_xor=0
	j=0
	while [ $j -lt $n ]
	do
		r_xor=`echo $((r_xor^a[$((i*n+j))]))`
		c_xor=`echo $((c_xor^a[$((j*n+i))]))`
		j=$(( j + 1 ))
	done
	if [ $max_xor -lt $c_xor ]
	then
		max_xor=$c_xor	
	elif [ $max_xor -lt $r_xor ]
	then
		max_xor=$r_xor
	fi
	i=$(( i + 1 ))
done 
echo "Maximum XOR: $max_xor"
