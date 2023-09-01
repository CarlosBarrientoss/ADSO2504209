package sena.william_pena.java_pillars;

public class Triangulo extends GeometricFigures {

    public Triangulo() {
        super();
    }

    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        super.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        super.altura = altura;
    }

    @Override
    public double calculateArea(){

        double area = (super.base * super.altura) / 2;
        System.out.println(String.format("Area del triangulo: %.2f", area));
        return area;
    }

    @Override
    public double calculatePerimeter() {

        double perimetro = super.base * 3;
        System.out.println(String.format("Perimetro del triangulo: %.2f", perimetro));
        return perimetro;
    }
}
