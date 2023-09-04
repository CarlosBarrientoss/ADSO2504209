package sena.juanCeferino.java_pillars;

public class Rombo implements IGeometricFigures{

    private double dShort;
    private double dLong;
    private double a;

    public Rombo() {
    }

    public Rombo(double dShort, double dLong, double a) {
        this.dShort = dShort;
        this.dLong = dLong;
        this.a = a;
    }

    public double getdShort() {
        return dShort;
    }

    public void setdShort(double dShort) {
        this.dShort = dShort;
    }

    public double getdLong() {
        return dLong;
    }

    public void setdLong(double dLong) {
        this.dLong = dLong;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        double area = (this.dLong * this.dShort) / 2;
        System.out.println(String.format("Area del rombo: %.2f", area));
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = this.a * 4;
        return perimeter;
    }
}
