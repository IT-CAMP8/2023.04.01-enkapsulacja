package pl.camp.it.enkapsulacja;

public class App2 {
    public static void main(String[] args) {
        Square s1 = new Square(5);

        System.out.println(s1.getSide());
        System.out.println(s1.getArea());
        System.out.println(s1.getCircuit());

        s1.setSide(10);

        System.out.println(s1.getSide());
        System.out.println(s1.getArea());
        System.out.println(s1.getCircuit());
    }
}
