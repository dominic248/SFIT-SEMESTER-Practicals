#!/bin/sh
echo "a. Currently logged-in user and his logged-in name"
echo "b. Your current shell"
echo "c. Your home directory"
echo "d. Your operating system type"
echo "e. Your current path setting"
echo "f. Your current working directory"
echo "g. Show Currently logged number of users"
echo "h. About your OS and version, release number, kernel version"
echo "i. Show all available shells"
echo "j. Show mouse settings"
echo "k. Show computer CPU information like processor type, speed etc."
echo "l. Show memory information"
echo "m. Show hard disk information like size of hard-disk, cache memory, model etc."
echo "n. File system (Mounted)\nm. EXIT"
while true
do
	echo -n "Enter your choice: "
	read choice
	case "$choice" in
		"a") 	username=`whoami`
				echo "Logged-in user is: $username"
				x=`finger $username -s | awk 'FNR == 2 {print $2}'`
				echo "Logged-in name: $x";;
		"b") 	shell=`basename $(readlink /proc/$$/exe)`
				echo "Your current shell is: $shell";;
		"c")	home=`echo $HOME`
				echo "Your HOME Directory is: $home";;
		"e")	path=`echo $PATH`
				echo "Your PATH setting is: $path";;
		"f")	cpath=` pwd`
				echo "Your current working directory is: $cpath";;
		"g")	logged=`who | wc -l`
				echo "No. of currently logged-in users is $logged";;
		"i")	allshells=`cat /etc/shells | awk 'FNR > 2 {print}'`
				echo "Available shells:\n$allshells";;	
		"m") break;;
		*) echo "Enter a valid choice!"
	esac
done
