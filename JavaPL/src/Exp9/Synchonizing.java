//Exp9.3
package Exp9;

class Pattern {
    public synchronized void display1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi!");
        }
    }
    public synchronized void display2() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello!");
        }
    }
}
class Thread1 implements Runnable {
    Pattern p;
    Thread1(Pattern p) {
        this.p = p;
    }
    public void run() {
        p.display1();
    }
}
class Thread2 implements Runnable {
    Pattern p;
    Thread2(Pattern p) {
        this.p = p;
    }
    public void run() {
        p.display2();
    }
}
public class Synchonizing {
    public static void main(String x[]) {
        Pattern p = new Pattern();
        Thread1 t1 = new Thread1(p);
        Thread2 t2 = new Thread2(p);
        Thread t11 = new Thread(t1, "Thread 1");
        Thread t12 = new Thread(t2, "Thread 2");
        t11.start();
        t12.start();
    }
}