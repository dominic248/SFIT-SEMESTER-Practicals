#!/bin/bash
declare -A arr
echo -n "Enter number of nodes: "
read n
i=1
while [ $n -ge $i ]
do
    echo -n "Enter a node: "
    read arr[$i]
    echo -n "Element to left of ${arr[$i]}: "
    read l[${arr[$i]}]
    echo -n "Element to right of ${arr[$i]}: "
    read r[${arr[$i]}]
    i=$(( i + 1 ))
done
for ((i=1; i<=n; i++)); do
	for ((j=1;j<=n;j++)); do
    a[$((i*n+j))]=0
    echo "Hello ${arr[$i]} ${arr[$j]}"
        if [ ${l[${arr[$i]}]} -eq ${arr[$j]} ]
        then
            a[$((i*n+j))]=1
        fi
        j=$(( j + 1 ))
        echo "Hello2 ${arr[$i]} ${arr[$j]}"
        if [ ${r[${arr[$i]}]} -eq ${arr[$j]} ]
        then
            a[$((i*n+j))]=1
        fi
        j=$(( j + 1 ))
	done
    i=$(( i + 1 ))
done
for ((i=1; i<=n; i++)); do
	for ((j=1;j<=n;j++)); do
		printf "%d" ${a[$((i*n+j))]}
		echo -n " "
	done
	echo ""
done

a=2

echo ${arr[l$a]}