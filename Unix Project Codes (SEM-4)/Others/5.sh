#!/bin/bash
echo "Enter size of MxN matrix: "
echo -n "Enter M: "
read m 
echo -n "Enter N: "
read n
for ((i=0; i<m; i++)); do
	for ((j=0;j<n;j++)); do
		echo -n "Enter value for N[$((i+1))$((j+1))]: "
		read a[$((i*n+j))]
	done
done
echo ""
echo "Entered matrix is: "
for ((i=0; i<m; i++)); do
	for ((j=0;j<n;j++)); do
		printf "%d" ${a[$((i*n+j))]}
		echo -e -n "\t"
	done
	echo ""
done
arr=()
for ((i=0; i<m; i++)); do
	for ((j=0;j<n;j++)); do
		arr+=(${a[$((i*n+j))]})
	done
done

total=`expr $m \* $n`
i=0
while [ $i -lt $total ]
do
    j=0
    while [ $j -lt $(( total - 1 )) ]
    do 
        if [ ${arr[$j]} -gt ${arr[$(( j + 1 ))]} ]
        then
            temp=${arr[$j]}
            arr[$j]=${arr[$(( j + 1 ))]}
            arr[$(( j + 1 ))]=$temp
        fi
        j=$(( j + 1 ))
    done
    i=$(( i + 1 ))
done
k=0
for ((i=$(( m - 1 )); i>=0; i--)); do
	for ((j=0;j<n;j++)); do
		a[$((i*n+j))]=${arr[$k]}
        k=$(( $k + 1 ))
	done
done
echo ""
echo "Required matrix is: "
for ((i=0; i<m; i++)); do
	for ((j=0;j<n;j++)); do
		printf "%d" ${a[$((i*n+j))]}
		echo -e -n "\t"
	done
	echo ""
done
