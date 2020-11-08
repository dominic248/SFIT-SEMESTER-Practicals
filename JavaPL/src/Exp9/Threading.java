//Exp9.1
package Exp9;

class Prime extends Thread {
    public void run() {
        System.out.println("Prime Numbers:");
        int i, j, flag = 0;
        for (i = 2; i < 20; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(i);

            }
            flag = 0;
        }
    }
}
class Fibo extends Thread {
    public void run() {
        System.out.println("Fibonacci Numbers: ");
        int a = 0, b = 1, n = 0, c = 0;
        while (n < 15) {
            c = a + b;
            System.out.println(a);
            a = b;
            b = c;
            n++;
        }
    }
}
public class Threading {
    public static void main(String x[]) {
        Prime p = new Prime();
        Fibo f = new Fibo();
        p.start();
        f.start();
    }
}
