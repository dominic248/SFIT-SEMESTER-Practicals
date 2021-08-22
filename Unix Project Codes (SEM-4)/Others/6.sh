#!/bin/bash
echo -n "Enter number of words: "
read n
arr=()
match=()
n1=$n
i=0
echo "Press Enter after each word:"
while [ $i -lt $n ] 
do
    read arr[$i]
    i=$((i+1))    
done
z=0
for((i=0; i<n; i++)); do
    item1=`echo ${arr[$i]} | tr '[A-Z]' '[a-z]'`
    for((j=$((i+1)); j<n; j++));do
        item2=`echo ${arr[$j]} | tr '[A-Z]' '[a-z]'`
        if [ $item1 = $item2 ]     
        then
            match[$z]=${arr[$i]}
            z=$((z+1))
            match[$z]=${arr[$j]}
            z=$((z+1))
        fi
    done
done
echo ""
echo "Words that occur more than once in a list:"
printf '%s\n' "${match[@]}" | sort -u
for items in "${match[@]}"
do
    arr=("${arr[@]/$items}")
done
echo ""
echo "After removing all words that occur more than once in a list:"
for items in "${arr[@]}"
do
    if [ "$items" = "" ]
    then
        continue
    else
        echo $items
    fi   
done