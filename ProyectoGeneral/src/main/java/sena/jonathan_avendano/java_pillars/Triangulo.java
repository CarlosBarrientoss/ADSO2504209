package sena.jonathan_avendano.java_pillars;

public class Triangulo implements IGeometricFigures {

    private double lado;
    private double altura;

    public Triangulo() {}

    public Triangulo(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calculateArea(){

        double area = (this.lado * this.altura) / 2;
        System.out.println(String.format("Area del triangulo: %.2f", area));
        return area;
    }

    @Override
    public double calculatePerimeter() {

        double perimeter = this.lado * 3;
        System.out.println(String.format("Perimetro del triangulo: %.2f", perimeter));
        return perimeter;
    }
}
