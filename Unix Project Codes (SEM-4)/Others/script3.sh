declare -a a
declare -a b

echo -n "Enter the Total number of stocks :"
read n 

#Cost price of the stock
echo "Enter cost price of stock :"
i=0 
  
while [ $i -lt $n ] 
do
    # To input from user 
    read a[$i] 
  
    i=`expr $i + 1` 
done
  
echo "The cost price of the stocks are :"
i=0 
  
while [ $i -lt $n ] 
do
    echo ${a[$i]} 
  
    i=`expr $i + 1` 
done

#Selling price of the stocks
echo "Enter the selling price of the stocks :"
i=0

while [ $i -lt $n ]
do
    read b[$i]

    i=`expr $i + 1`
done

echo "The selling price of the stocks are :"
i=0

while [ $i -lt $n ]
do
    echo ${b[$i]}

    i=`expr $i + 1`
done


#Find the profit or loss of the stock
profit=0
i=0
while [ $i -lt $n ]
do
    valA=${a[$i]}
    valB=${b[$i]}
    temp=$(($valB-$valA))

    if [ $temp -gt $profit ]
    then
	    profit=$temp	    
    fi

    i=`expr $i + 1`
done

echo "The maximum profit earned is "
echo $profit

