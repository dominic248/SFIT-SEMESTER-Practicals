package Exp6;

import java.util.Scanner; //import header
class staff{
    int code_no;  //variable declaration
    Scanner sc=new Scanner(System.in); //Scanner class object creation   
    void get_code() //method to get code number of staff member 
    {
        System.out.print("Enter code number: ");
        code_no=sc.nextInt();
    }
}
class teacher extends staff{ //teacher is child class with staff as parent class
    String subj;   
    void getSubject() //method to get subject of teacher
    {
        System.out.print("Enter subject of teacher: ");
        subj=sc.next();
    }    
    void displaySubject() //method to display details of teacher
    {
        System.out.println("Code_no of teacher: "+code_no);
        System.out.println("Subject of teacher: "+subj);        
    }
}
class officer extends staff{ //officer is child class with staff as parent class
    String grade;   
    void getGrade() //method to get grade of officer
    {
        System.out.print("Enter grade of officer: ");
        grade=sc.next();
    }   
    void displayGrade() //method to get display details of officer
    {
        System.out.println("Code no of officer: "+code_no);
        System.out.println("Grade of officer: "+grade);
    }
}
public class Mains1 
{
    public static void main(String args[]) //main method
    {
        teacher t=new teacher(); //teacher object creation
        officer o=new officer(); //officer object creation         
        t.get_code();
        t.getSubject();
        o.get_code();
        o.getGrade();
        t.displaySubject();
        o.displayGrade();
    }
}
