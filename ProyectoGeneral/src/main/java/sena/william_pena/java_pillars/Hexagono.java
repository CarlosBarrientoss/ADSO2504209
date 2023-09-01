package sena.william_pena.java_pillars;

public class Hexagono implements IGeometricFigures{

    private double lado;
    private double a;

    public Hexagono() {
    }

    public Hexagono(double lado, double a) {
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
        double perimeter = this.lado * 6;
        System.out.println(String.format("Perimetro del rombo: %.2f", perimeter));
        return perimeter;
    }
}
