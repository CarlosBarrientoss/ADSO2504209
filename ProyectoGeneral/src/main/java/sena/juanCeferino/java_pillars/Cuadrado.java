package sena.juanCeferino.java_pillars;

public class Cuadrado implements IGeometricFigures {

    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculateArea() {

        double area = Math.pow(this.lado, 2);
        System.out.println(String.format("Area del cuadrado: %.2f", area));
        return area;
    }

    @Override
    public double calculatePerimeter() {

        double perimeter = this.lado * 4;
        System.out.println(String.format("Perimetro del cuadrado: %.2f", perimeter));
        return perimeter;
    }
}
