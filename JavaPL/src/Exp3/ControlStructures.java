package Exp3;

import java.util.*;						//Import all header files

public class ControlStructures {				            //Start new Class SwitchFinal…

     static int power(int u, int v){
        int i,p=1;
        for(i=1;i<=v;i++){
            p=p*u;
        }
        return p;
    }
    
        public static void main(String[] args) {			//Start main method…
        Scanner sc = new Scanner(System.in);			//Initialize new scanner 
        int fact = 1, t, rev = 0, s = 0, p = 1, i, a, c, count = 1,rem;		//Declare and initialize all the variables required globally
        System.out.println("1.Factorial \n 2.Reverse \n 3.Pallindrome \n 4.Prime \n 5.Fibonacci \n 6.Amstrong "); //Print
        System.out.print("Enter your choice: ");			//Print Enter your choice
        int ch = sc.nextInt();					//Input Choice(ch)
        switch (ch) {						//Start Switch case…
            case 1:							//Case 1  for factorial
                System.out.print("Enter a number for finding factorial: "); 	//Print the number for finding factorial
                int n = sc.nextInt();					//Input a number (n)
                for (i = 1; i <= n; i++) {					//Start for loop…
                    fact = fact * i;
                }						//Condition for factorial
                System.out.println("Factorial of " + n + " is " + fact);	//Prints the factorial of the entered number
            case 2:							//Case 2 Reverse 
                System.out.print("Enter a number for reversing: ");	//Print Enter a number for Reversing
                int m = sc.nextInt();					//Input number for reversing(m)
                int no = m;							//Put variable m value in no
                while (m > 0) {						//Start while loop with the positive condition 
                    t = m % 10;						//Take modulus
                    rev = (rev * 10) + t;					//The main expression for reversing a string
                    m = m / 10;
                }
                /*Divide number m by 10 and store it in same variable. End of while loop*/
                System.out.println("The reverse of " + no + " is " + rev);    //Print the Reverse of the string
            case 3:							//Case 3  Palindrome
                System.out.print("Enter a number for checking palindrome: ");    //Print Enter the number for checking palindrome
                int o = sc.nextInt();					//Input the number (in o)
                a = o;						//Store the value of o in temporary variable a
                while (o > 0) {					//Start while loop…
                    t = o % 10;						//Taking modulus of “o” the entered number
                    rev = (rev * 10);					//The main logic of reversing a string
                    o = o / 10;
                }
                /*Diving by 10 and storing the value in itself. End of while statement*/
                if (a == o) {						//Start if loop…
                    System.out.println("It is not pallindrome");	//Print if it is not a palindrome
                } else {
                    System.out.println("It is a Pallindrome");		//Print if it is a palindrome
                }							//End of if statement
            case 4:						//Case 4 Prime Number
                int i1,
                 m1 = 0,
                 flag = 0;					//Declaring and initializing the local variables
                System.out.print("Enter number to be checked for prime condition: ");    //it is the number to be checked
                int n2 = sc.nextInt();				//Input the number to be checked
                m1 = n2 / 2;						//Dividing the number by 2
                if (n2 == 0 || n2 == 1) {					//Starting of if loop… if condition is true
                    System.out.println(n2 + " is not prime number");	//Print it is not prime number
                } else {						//Else if the condition is false
                    for (i1 = 2; i1 <= m1; i1++) {				//Start the for loop…
                        if (n2 % i1 == 0) {					//Start the nested if loop…
                            System.out.println(n2 + " is not prime number");	//Print the number is not prime
                            flag = 1;						//Incrementing the flag by1
                            break;						//Breaking the if statement for stopping iteration
                        }
                    }							//End of for loop and nested if loop
                    if (flag == 0) {
                        System.out.println(n2 + " is prime number");
                    }		//If flag is 0 print that the number is prime
                }                  					 //end of else
            case 5:						//Case 5 Fibonacci Series
                int q = 0,
                 w = 1,
                 e,
                 i2;					//Initializing and declaring the local variables
                System.out.print("Enter the limit of fibonacci series: ");		//Print Enter the limit of Fibonacci series
                int count1 = sc.nextInt();					//Enter the limit of fiboacci series
                System.out.print(q + " " + w);                                                       //printing 0 and 1		
                for (i2 = 2; i2 < count1; ++i2) //loop starts from 2 because 0 and 1 are already printed
                {
                    e = q + w;					//Adding the first two digits and store in a variable
                    System.out.print(" " + e);				//Print the sum
                    q = w;						//Storing the value (1) of variable in another variable
                    w = e;
                }						//Store the sum of first two numbers again in other variable
            case 6:
                //Case 6 Armstrong Number
                int c4 = 0,a5,temp,count6=0;					//Initializing and declaring the variables
                System.out.print("\nEnter  the no to be checked for Armstrong condition:");   //It is the number to check Armstrong
                int n6 = sc.nextInt();				//Input the number to be checked
                temp = n6;
                while(temp!=0){
                    count6++;
                    temp=temp/10;
                }
                //Storing it in temporary variable
                temp = n6;
                while (temp > 0) {					//Start while loop for the positive condition
                    rem = temp % 10;				//Taking modulus of the entered number and storing it in a variable
                    temp = temp / 10;					//Dividing the entered number by 10 and storing in another variable
                    c4 = c4 + power(rem,count6);				//Main logic of checking the Armstrong number
                }
                if (n6 == c4) {
                    System.out.println(+n6 + " Armstrong number");
                    //Print if the condition is true the number is Armstrong
                } else {
                    System.out.println(+n6 + " Not armstrong number");
                    //Else print number is not Armstrong
                }
                
        }
    }				//End of main method
}					//End of class

