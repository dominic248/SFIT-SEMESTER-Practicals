package calculate;

public class Calculation {

    public static void main(String[] args) {
        geometry.SquareArea sa = new geometry.SquareArea();
        sa.side = 14;
        System.out.println("Area of Square is: " + sa.calc());
        figures.SquarePerl sp = new figures.SquarePerl();
        sp.side = 12;
        System.out.println("Perimeter of Square: " + sp.calc());
    }
}
