#!/bin/bash
echo "Enter size of MxN matrix: "
echo -n "Enter M: "
read m 
echo -n "Enter N: "
read n
r=$m
c=$n
k=0
l=0
x="X"
while [ $k -lt $m -a $l -lt $n ]
do
    for ((i=$l; i<n; ++i)); do
        a[$((k*c+i))]=$x
    done
    k=$(( k + 1 ))
    for ((i=$k; i<m; ++i)); do
        n1=$(( n - 1 ))
        a[$((i*c+n1))]=$x
    done
    n=$(( n - 1 ))
    if [ $k -lt $m ]
    then
        for ((i=$(( n - 1 )); i>=l; --i)); do
            m1=$(( m - 1 ))
            a[$((m1*c+i))]=$x
        done  
        m=$((m-1)) 
    fi
    if [ $l -lt $n ]
    then
        for ((i=$(( m - 1 )); i>=k; --i)); do
            a[$((i*c+l))]=$x
        done 
        l=$((l+1))    
    fi
    if [ "$x" = "0" ]
    then
        x="X"
    else
        x="0"
    fi
done

echo ""
echo "Entered matrix is: "
for ((i=0; i<r; i++)); do
	for ((j=0;j<c;j++)); do
		printf "%c" ${a[$((i*c+j))]}
		echo -e -n " "
	done
	echo ""
done
