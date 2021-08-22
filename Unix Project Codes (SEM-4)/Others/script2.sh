#!/bin/bash
declare -A matrix
declare -i sum=0

echo "Enter the number of rows"
read num_rows
echo "Enter the number of columns"
read num_columns

echo "Enter the element of the matrix"
for ((i=1;i<=num_rows;i++)) do
    for ((j=1;j<=num_columns;j++)) do
	    read val
	    matrix[$i,$j]=$(($val))
    done
done
echo " "

echo "The matrix is"

f1="%$((${#num_rows}+1))s"
f2=" %9s"

printf "$f1" ''
for ((i=1;i<=num_rows;i++)) do
    printf "$f2" $i
done
echo

for ((j=1;j<=num_columns;j++)) do
    printf "$f1" $j
    for ((i=1;i<=num_rows;i++)) do
        printf "$f2" ${matrix[$i,$j]}
    done
    echo
done

for((i=0; i<num_rows; i++)) do
	for((j=0;j<num_columns;j++))do
		tempSum=$((matrix[$i,$j]))
		sum=$((sum+tempSum))
	done
done


echo "Maximum sum of hour glass = "
echo $sum
