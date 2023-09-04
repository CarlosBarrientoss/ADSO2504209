package sena.juanCeferino.java_pillars;

public class Pentagono implements IGeometricFigures{

    private double lado;
    private double a;

    public Pentagono() {
    }

    public Pentagono(double lado, double a) {
        this.lado = lado;
        this.a = a;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        double area = (this.calculatePerimeter() * this.a) / 2;
        System.out.println(String.format("Area del rombo: %.2f", area));
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = this.lado * 5;
        System.out.println(String.format("Perimetro del rombo: %.2f", perimeter));
        return perimeter;
    }
}
