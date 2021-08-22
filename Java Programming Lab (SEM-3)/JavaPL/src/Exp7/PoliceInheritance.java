package Exp7;

import java.util.*;
interface IsEmergency {
    public void eDetails();
}
interface IsLandVehicle {
    public void vDetails();
}
class PoliceCar implements IsEmergency, IsLandVehicle {
    Random r = new Random();
    public void eDetails() {
        System.out.println("Caller's no is: " + r.nextInt());
    }
    public void vDetails() {
        System.out.println("Vehicle's no is: " + r.nextInt(9999));
    }
    public void cases() {
        System.out.println("Number of vigilants caught: " + r.nextInt(2));
    }
}
public class PoliceInheritance {
    public static void main(String[] args) {
        PoliceCar g = new PoliceCar();
        g.eDetails();
        g.vDetails();
        g.cases();
    }
}
