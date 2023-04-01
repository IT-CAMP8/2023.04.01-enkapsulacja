package pl.camp.it.enkapsulacja;

public class Square {
    private int side;
    private int area;
    private int circuit;

    public Square(int side) {
        this.side = side;
        this.area = side * side;
        this.circuit = side * 4;
    }

    int getSide() {
        return this.side;
    }

    public int getArea() {
        return area;
    }

    public int getCircuit() {
        return circuit;
    }

    void setSide(int side) {
        this.side = side;
        this.area = side * side;
        this.circuit = side * 4;
    }
}
