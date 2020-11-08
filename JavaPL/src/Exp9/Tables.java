//Exp9.2
package Exp9;

import static java.lang.Thread.currentThread;
class Formula implements Runnable{
    int i,n;
    Formula(int n){
        this.n=n;
    }
    public void run(){
        for(i=1;i<=10;i++){
         System.out.printf("%s:%d*%d=%d\n",currentThread().getName(),n,i,n*i);
        }
    } 
}
public class Tables {
    public static void main(String x[]){
        Formula five=new Formula(5);
        Formula seven=new Formula(7);
        Formula thirteen=new Formula(13);
        Thread t1=new Thread(five,"Multiplication of five");
        Thread t2=new Thread(seven,"Multiplication of seven");
        Thread t3=new Thread(thirteen,"multiplication of thirteen");
        t1.start();
        t2.start();
        t3.start();
    }
}