#!/bin/sh
cont="y"
while [ "$cont" = "y" ]
do
	echo "Enter the File path:"
	read filepath
	if [ -f $filepath ]
	then
		pathonly=${filepath%/*}
		fileonly=`basename $filepath`
		slash="/"
		#echo $pathonly
		#echo $fileonly
		echo " 1. Upper-Case to Lower-Case \n 2. Lower-Case to Upper-Case"
		echo " 3. Reverse the Case \n 4. EXIT"
		new=""
		echo -n "Enter your choice: "
		read choice
		case "$choice" in
			"1")	echo "Renaming from Upper-Case to Lower-Case to: "
				new=`echo $fileonly | tr '[A-Z]' '[a-z]'`;;
			"2")	echo "Renaming from Lower-Case to Upper-Case to: "
				new=`echo $fileonly | tr '[a-z]' '[A-Z]'`;;
			"3")	echo "Renaming by reversing the Case: "
				i=1
				while [ $i -le ${#fileonly} ]
				do
					ch=`echo $fileonly | cut -c $i`
					case $ch in
						[A-Z])	new=$new"`echo $fileonly | cut -c $i | tr '[A-Z]' '[a-z]'`";;
						[a-z])	new=$new"`echo $fileonly | cut -c $i | tr '[a-z]' '[A-Z]'`";;
						*)	new=$new"`echo $fileonly | cut -c $i`";;
					esac
					i=`expr $i + 1`
				done;;
		esac
		newfilepath="$pathonly/$new"
		echo $newfilepath
		if [ "$fileonly" != "$new" ]
		then
			mv $filepath $newfilepath
		fi
	else
		echo "$filepath file does not exist!"
	fi
	echo -n "Do you want to continue? y/n? "
	read cont
	if [ "$cont" = "n" ]
	then
		exit
	fi
done
