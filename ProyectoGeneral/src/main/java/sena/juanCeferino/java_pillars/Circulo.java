package sena.juanCeferino.java_pillars;

public class Circulo implements IGeometricFigures{
    private double radio;
    private static final double PI = 3.14159;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculateArea() {
        double area = PI * Math.pow(this.radio, 2);
        System.out.println(String.format("Area del circulo: %.2f", area));
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = (this.radio * 2) * PI;
        System.out.println(String.format("Perimetro del circulo: %.2f", perimeter));
        return perimeter;
    }
}
